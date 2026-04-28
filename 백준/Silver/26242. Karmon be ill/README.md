# [Silver I] Karmon be ill - 26242

[문제 링크](https://www.acmicpc.net/problem/26242)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 7, 정답: 7, 맞힌 사람: 7, 정답 비율: 100.000%

### 분류

자료 구조, 우선순위 큐

### 문제 설명

<p>Vasya loves catching karmons. Every karmon has a numerical parameter<em>BP</em> (battle power). The larger the parameter value, the stronger the karmon --- and the more valuable.</p>

<p>Vasya&#39;s feeling ill and he&#39;s asked his friend Peter to go karmon trapping instead of him. Peter has agreed, but Vasya also asked for another thing: he wants Peter to report the <em>BP</em> sum of the $K$ most powerful currently caught karmons every time Peter catches another karmon. Peter has found this request a bit weird, but there&#39;s nothing he wouldn&#39;t do for an ill friend. Nevertheless he decided to clarify things and asked Vasya what should be done if he hasn&#39;t yet collected $K$ karmons. Vasya gave it a thought and decided that in this case, Peter shouldn&#39;t report anything at all.</p>

<p>Help Peter write a program that is fed a list of <em>BP</em>&#39;s of the caught karmons and produces the values to be reported to Vasya.</p>

### 입력

<p>The first line contains two integers: $N$ --- the total number of the trapped karmons and $K$ --- the number of karmons for which the sum of their <em>BP</em> must be reported ($10 \le N \le 100\,000$, $2 \le K \le \min(N, 1000)$).</p>

<p>The second line contains $N$ integers defining the karmons&#39; BP in order of catching. All these numbers lie within the range of $1$ to $10\,000$ inclusively.</p>

### 출력

<p>The single line of the output file must contain $(N - K + 1)$ integers --- the sums of <em>BP</em> for the $K$ most powerful karmons after catching each karmon (beginning from the $K$-th one).</p>