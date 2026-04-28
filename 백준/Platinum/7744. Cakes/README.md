# [Platinum I] Cakes - 7744

[문제 링크](https://www.acmicpc.net/problem/7744)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 32 MB

### 통계

제출: 100, 정답: 49, 맞힌 사람: 40, 정답 비율: 50.000%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Once upon a time, in the poor poor kingdom of Ragland, there lived a king and a queen (of beggars). They had only one daughter, charming Pauperella, who was to be married to beautiful and astonishingly rich prince Goldteeth. Although the young princess protested, her parents insisted that the wedding should take place in their castle. They asked their excellent cook to prepare the wedding cakes &mdash; the famous wedding cakes of Ragland. But because they are not so well-off as one may expect (considering they are a royal couple), they only have this one cook and only one small oven, in which all the cakes have to be baked.</p>

<p>The cook has to prepare N different cakes. Preparation of a cake consists of two phases: In the first phase the cook prepares the dough for the cake and puts it into a form. In the second phase the cake bakes in the oven. Preparing the dough for the i-th cake takes ai seconds. After the dough is ready, the cake needs to be baked for bi seconds. (Note that it doesn&#39;t have to be baked immediately after it is ready, the dough may sit in its form for a while.) The cook is able to prepare only one dough at a time. At any moment at most one cake may be baking in the oven. The cook may prepare and bake the cakes in arbitrary order.</p>

<p>Your task is to find out the minimum time which is needed to prepare all the cakes. You may suppose that manipulations with the oven (i.e., inserting a cake and removing a baked cake from the oven) can be accomplished in zero time.</p>

### 입력

<p>On the first line of the input&nbsp;there is a positive integer N &le; 1 000 000 &mdash; the number of cakes, which have to be made. Each of the following N lines contains two positive integers a<sub>i</sub>, b<sub>i</sub> &le; 2 000 000 000, where a<sub>i</sub> is the time needed to prepare the dough of the i-th cake and b<sub>i</sub> the time needed to bake it.&nbsp;</p>

### 출력

<p>The output shall contain one line with the minimum time, in which all the cakes can be made. You may assume that the answer won&#39;t exceed 2 000 000 000.</p>