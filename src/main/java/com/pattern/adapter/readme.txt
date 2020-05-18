适配器模式：
    就是插头的转换头、编码解码、调制解调器
    老系统稳定，为了保持稳定不修改原来代码，向下兼容写代码
对适配器模式的功能很好理解，
就是把一个类的接口变换成客户端所能接受的另一种接口，
从而使两个接口不匹配而无法在一起工作的两个类能够在一起工作。
InputStreamReader继承了Reader抽象类并实现，且持有了InputStream的引用，这里是通过StreamDecoder类间接持有的，因为从byte到char要经过编码。
很显然，适配器就是InputStreamReader，源角色就是InputStream代表的实例对象，目标接口就是Reader类
