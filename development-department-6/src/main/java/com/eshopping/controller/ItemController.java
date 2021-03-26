package com.eshopping.controller;

import com.alibaba.fastjson.JSONObject;
import com.eshopping.base.BaseController;
import com.eshopping.entity.RespPageEntity;
import com.eshopping.entity.Result;
import com.eshopping.entity.ResultEnum;
import com.eshopping.entity.ResultUtil;
import com.eshopping.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ThisPC
 * @date 2021/3/25
 */
@RestController
@CrossOrigin
@RequestMapping("/item")
public class ItemController extends BaseController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/showAll")
    public Result showAll() {
        /* ---后台展示所有商品--- */
        return ResultUtil.success(itemService.showAll());
    }

    @GetMapping("/show")
    public Result show() {
        /* ---小程序：首页推荐商品--- */
        return ResultUtil.success(itemService.showTop());
    }

    @GetMapping("/list")
    public Result popular(@RequestParam("id")Integer id) {
        /* ---小程序：热门，热销，高收藏--- */
        if (id != null) {
            return ResultUtil.success(itemService.showList(id));
        }
        return ResultUtil.error(ResultEnum.DATA_IS_NULL.getFlag(), ResultEnum.DATA_IS_NULL.getCode());
    }

    @PostMapping("/showOff")
    public Result showOff(@RequestParam("id")Integer id) {
        /* ---通过类别获取商品--- */
        if (!isEmpty(id)) {
            return ResultUtil.success(itemService.showItemByCategory(id));
        }
        // 删除不成功
        return ResultUtil.error(ResultEnum.DATA_IS_NULL.getFlag(), ResultEnum.DATA_IS_NULL.getCode());
    }

    @PostMapping("/search")
    public Result search(@RequestParam("name")String name) {
        /* ---通过商品名模糊查询商品--- */
        if (!isEmpty(name)) {
            return ResultUtil.success(itemService.showItemByName(name));
        }
        // 删除不成功
        return ResultUtil.error(ResultEnum.DATA_IS_NULL.getFlag(), ResultEnum.DATA_IS_NULL.getCode());
    }

    @PostMapping("/details")
    public Result details(@RequestParam("id")Integer id) {
        /* ---获取商品详情--- */
        if (!isEmpty(id)) {
            return ResultUtil.success(itemService.getById(id));
        }
        // 删除不成功
        return ResultUtil.error(ResultEnum.DATA_IS_NULL.getFlag(), ResultEnum.DATA_IS_NULL.getCode());
    }

    @PostMapping("/add")
    public Result addItemCategory(@RequestBody JSONObject newForm) {
        /* ---添加类目方法--- */
        if (isEmpty(newForm.get("name")) && itemService.addItem(newForm)) {
            // 添加成功无返回
            return ResultUtil.success();
        }
        // 添加不成功
        return ResultUtil.error(ResultEnum.DATA_IS_NULL.getFlag(), ResultEnum.DATA_IS_NULL.getCode());
    }

    @PostMapping("/delete")
    public Result deleteItem(@RequestParam("id")Integer id) {
        /* ---删除（上架下架方法）--- */
        if (!isEmpty(id)) {
            // （逻辑）删除成功无返回
            itemService.deleteItem(id);
            return ResultUtil.success();
        }
        // 删除不成功
        return ResultUtil.error(ResultEnum.DATA_IS_NULL.getFlag(), ResultEnum.DATA_IS_NULL.getCode());
    }
    /**
     * 根据页码和大小分页查询
     * @param page 当前页，默认为1 * @param size 当前每页显示行数，默认为5 * @return 页信息的实体
     */
    @GetMapping("/page")
    public RespPageEntity getAllUserByPage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "5") Integer size)
    {
        return itemService.getAllUserByPage(page, size);
    }
    //商品收藏
    @RequestMapping("collect")
    public Result collect(@RequestParam("id") Integer id) {
        itemService.collect(id);
        return ResultUtil.success();
    }
}
