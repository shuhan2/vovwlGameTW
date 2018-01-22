### 题目
对于一个给定的字符串，如果其中元音字母数目在整个字符
串中的比例超过了30%，则将该元音字母替换成字符串
mommy，额外的，在替换时，如果有连续的元音出现，则仅
替换一次。

# 分析
- 输入一个元音，预期返回为mommy
- 输入一个非元音字符，预期返回字符本身
- 输入一个元音超过30%的字符串，预期元音被替换
- 输入一个元音超过30%，并存在连续元音字符，预期连续
的元音字符只被替换一次

### 测试用例1：
- 输入是否是字母


### 测试用例2：
- 元音字母比例小于等于30%，返回元字符串(hmm)
- 输入一个元音字母。返回mommy
- 元音字母比例大于30%，没有相邻的元音字母，替换(ahe-mommyhmommy),元音字母放在字符串的头尾
- 元音字母比例大于30%，有相邻的元音字母，替换(hear-hmommy)
