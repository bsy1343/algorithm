# [Gold II] Acowdemia - 21819

[문제 링크](https://www.acmicpc.net/problem/21819)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 365, 정답: 119, 맞힌 사람: 103, 정답 비율: 32.492%

### 분류

그리디 알고리즘, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p>Bessie the cow has enrolled in a computer science PhD program, driven by her love of computer science and also the allure of one day becoming &quot;Dr. Bessie&quot;. Having worked for some time on her academic research, she has now published $N$ papers ($1 \leq N \leq 10^5$), and her $i$-th paper has accumulated $c_i$ citations ($0 \leq c_i \leq 10^5$) from other papers in the research literature.</p>

<p>Bessie has heard that an academic&#39;s success can be measured by their $h$-index. The $h$-index is the largest number $h$ such that the researcher has at least $h$ papers each with at least $h$ citations. For example, a researcher with $4$ papers and respective citation counts $(1,100,2,3)$ has an $h$-index of $2$, whereas if the citation counts were $(1,100,3,3)$ then the $h$-index would be $3$.</p>

<p>To up her $h$-index, Bessie is planning to write up to $K$ survey articles ($0 \leq K \leq 10^5$), each citing many of her past papers. However, due to page limits, she can only cite at most $L$ papers in each survey ($0 \leq L \leq 10^5$). Of course, no paper may be cited multiple times in a single survey (but a paper may be cited in several surveys).</p>

<p>Help Bessie determine the maximum $h$-index she may achieve after writing these survey articles. Bessie is not allowed to cite a survey from one of her surveys.</p>

<p>Note that Bessie&#39;s research advisor should probably inform her at some point that writing a survey solely to increase one&#39;s $h$ index is ethically dubious; other academics are not recommended to follow Bessie&#39;s example here.</p>

### 입력

<p>The first line contains $N$, $K$, and $L$.</p>

<p>The second line contains $N$ space-separated integers $c_1,\ldots, c_N$.</p>

### 출력

<p>The maximum $h$-index on a single line.</p>