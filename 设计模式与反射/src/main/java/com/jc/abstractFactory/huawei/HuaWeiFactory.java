package com.jc.abstractFactory.huawei;

import com.jc.abstractFactory.abstracts.IProductFactory;
import com.jc.abstractFactory.abstracts.IRouterProduct;
import com.jc.abstractFactory.abstracts.IphoneProduct;


//生产华为产品的工厂
public class HuaWeiFactory implements IProductFactory {
    @Override
    public IphoneProduct iphoneProduct() {
        return new HuaWeiPhone();
    }

    @Override
    public IRouterProduct routerProduct() {
        return new HuaWeiRouter();
    }
}
