package com.eshopping.controller;

import com.alibaba.fastjson.JSONObject;
import com.eshopping.base.BaseController;
import com.eshopping.entity.Result;
import com.eshopping.entity.ResultEnum;
import com.eshopping.entity.ResultUtil;
import com.eshopping.pojo.vo.ItemCategoryVo;
import com.eshopping.service.ItemCategoryService;
import com.eshopping.service.ItemCategoryVoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ThisPC
 * @date 2021/3/19
 */
@RestController
@CrossOrigin
@RequestMapping("/itemCategory")
public class ItemCategoryController extends BaseController {
    @Autowired
    private ItemCategoryService itemCategoryService;
    @Autowired
    private ItemCategoryVoService itemCategoryVoService;

    @GetMapping("/show")
    public Result show() {
        /* ---展示一级类目--- */
        List<ItemCategoryVo> list = itemCategoryVoService.showList();
        // 查询成功
        return ResultUtil.success(list);
    }

    @GetMapping("/find")
    public Result listByPid(@RequestBody JSONObject editForm) {
        /* ---通过父id查找商品类目（三级列表展示）--- */
        Integer id = (Integer)editForm.get("id");
        if (!isEmpty(id)) {
            List<ItemCategoryVo> list = itemCategoryVoService.getChildBySql(id);
            // 查询成功
            return ResultUtil.success(list);
        }
        // 查询不成功
        return ResultUtil.error(ResultEnum.DATA_IS_NULL.getFlag(), ResultEnum.DATA_IS_NULL.getCode());
    }

    @PostMapping("/add")
    public Result addItemCategory(@RequestBody JSONObject newForm) {
        /* ---添加类目方法--- */
        if (!isEmpty(newForm.get("cateName")) && itemCategoryService.addItemCategory(newForm)) {
            // 添加成功无返回
            return ResultUtil.success();
        }
        // 添加不成功
        return ResultUtil.error(ResultEnum.DATA_IS_NULL.getFlag(), ResultEnum.DATA_IS_NULL.getCode());
    }

    @PostMapping("/change")
    public Result changeItemCategory(@RequestBody JSONObject editForm) {
        /* ---修改类目名方法--- */
        Integer id = (Integer)editForm.get("cateId");
        if (!isEmpty(id)) {
            // 改名成功无返回
            itemCategoryService.changeItemCategory((String)editForm.get("cateName"), id);
            return ResultUtil.success();
        }
        // 改名不成功
        return ResultUtil.error(ResultEnum.DATA_IS_NULL.getFlag(), ResultEnum.DATA_IS_NULL.getCode());
    }

    @PostMapping("/delete")
    public Result deleteCategory(@RequestParam("id")Integer id) {
        /* ---删除（上架下架方法）--- */
        if (!isEmpty(id)) {
            // （逻辑）删除成功无返回
            itemCategoryService.deleteItemCategory(id);
            return ResultUtil.success();
        }
        // 删除不成功
        return ResultUtil.error(ResultEnum.DATA_IS_NULL.getFlag(), ResultEnum.DATA_IS_NULL.getCode());
    }
}
