# [Gold IV] It's not a Bug, it's a Feature! - 6305

[문제 링크](https://www.acmicpc.net/problem/6305)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 15, 정답: 7, 맞힌 사람: 6, 정답 비율: 85.714%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>It is a curious fact that consumers buying a new software product generally do not expect the software to be bug-free. Can you imagine buying a car whose steering wheel only turns to the right? Or a CD-player that plays only CDs with country music on them? Probably not. But for software systems it seems to be acceptable if they do not perform as they should do. In fact, many software companies have adopted the habit of sending out patches to fix bugs every few weeks after a new product is released (and even charging money for the patches).</p>

<p>Tinyware Inc. is one of those companies. After releasing a new word processing software this summer, they have been producing patches ever since. Only this weekend they have realized a big problem with the patches they released. While all patches fix some bugs, they often rely on other bugs to be present to be installed. This happens because to fix one bug, the patches exploit the special behavior of the program due to another bug.</p>

<p>More formally, the situation looks like this. Tinyware has found a total of n bugs B = {b<sub>1</sub>, b<sub>2</sub>, ..., b<sub>n</sub>} in their software. And they have released m patches p<sub>1</sub>, p<sub>2</sub>, ..., p<sub>m</sub>. To apply patch pi to the software, the bugs B<sub>i</sub><sup>+</sup> &sube; B have to be present in the software, and the bugs B<sub>i</sub><sup>-</sup> &sube; B must be absent (of course B<sub>i</sub><sup>+</sup> &cap; B<sub>i</sub><sup>-</sup> = &empty; holds). The patch then fixes the bugs F<sub>i</sub><sup>-</sup> &sube; B (if they have been present) and introduces the new bugs F<sub>i</sub><sup>+</sup> &sube; B (where, again, F<sub>i</sub><sup>-</sup> &cap; F<sub>i</sub><sup>+</sup> = &empty;).</p>

<p>Tinyware&#39;s problem is a simple one. Given the original version of their software, which contains all the bugs in B, it is possible to apply a sequence of patches to the software which results in a bugfree version of the software? And if so, assuming that every patch takes a certain time to apply, how long does the fastest sequence take?</p>

### 입력

<p>The input contains several product descriptions. Each description starts with a line containing two integers n and m, the number of bugs and patches, respectively. These values satisfy 1 &le; n &le; 20 and 1 &le; m &le; 100. This is followed by m lines describing the m patches in order. Each line contains an integer, the time in seconds it takes to apply the patch, and two strings of n characters each.</p>

<p>The first of these strings describes the bugs that have to be present or absent before the patch can be applied. The i-th position of that string is a &ldquo;+&rdquo; if bug b<sub>i</sub> has to be present, a &ldquo;-&rdquo; if bug bi has to be absent, and a &ldquo;0&rdquo; if it doesn&#39;t matter whether the bug is present or not.</p>

<p>The second string describes which bugs are fixed and introduced by the patch. The i-th position of that string is a &ldquo;+&rdquo; if bug b<sub>i</sub> is introduced by the patch, a &ldquo;-&rdquo; if bug b<sub>i</sub> is removed by the patch (if it was present), and a &ldquo;0&rdquo; if bug b<sub>i</sub> is not affected by the patch (if it was present before, it still is, if it wasn&#39;t, is still isn&#39;t).</p>

<p>The input is terminated by a description starting with n = m = 0. This test case should not be processed.</p>

### 출력

<p>For each product description first output the number of the product. Then output whether there is a sequence of patches that removes all bugs from a product that has all n bugs. Note that in such a sequence a patch may be used multiple times. If there is such a sequence, output the time taken by the fastest sequence in the format shown in the sample output. If there is no such sequence, output &ldquo;Bugs cannot be fixed.&rdquo;.</p>

<p>Print a blank line after each test case.</p>