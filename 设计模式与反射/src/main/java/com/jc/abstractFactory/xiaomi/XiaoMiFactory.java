package com.jc.abstractFactory.xiaomi;

import com.jc.abstractFactory.abstracts.IProductFactory;
import com.jc.abstractFactory.abstracts.IRouterProduct;
import com.jc.abstractFactory.abstracts.IphoneProduct;
import com.jc.abstractFactory.huawei.HuaWeiPhone;
import com.jc.abstractFactory.huawei.HuaWeiRouter;


//生产小米产品的工厂
public class XiaoMiFactory implements IProductFactory {
    @Override
    public IphoneProduct iphoneProduct() {
        return new XiaoMiPhone();
    }

    @Override
    public IRouterProduct routerProduct() {
        return new XiaoMiRouter();
    }
}
