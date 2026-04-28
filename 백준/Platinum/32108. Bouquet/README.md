# [Platinum III] Bouquet - 32108

[문제 링크](https://www.acmicpc.net/problem/32108)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 45, 정답: 27, 맞힌 사람: 26, 정답 비율: 86.667%

### 분류

다이나믹 프로그래밍, 자료 구조, 세그먼트 트리, 우선순위 큐

### 문제 설명

<p>After visiting Keukenhof, one of the world&#39;s largest flower gardens, Lieke became very fond of flowers, so she has decided to collect some tulips growing next to the road in order to build a beautiful bouquet. However, when collecting the flowers, she has to respect some rules due to the strict tulip protection laws in the Netherlands.</p>

<p>There are $N$ tulips numbered from $0$ to $N-1$ growing in a line along the road, in order from left to right. The tulip protection law assigns two integers, $l_i$ and $r_i$, to tulip $i$. In case tulip $i$ is included in the bouquet, the $l_i$ tulips immediately to the left of tulip $i$ and the $r_i$ tulips immediately to the right of tulip $i$ cannot also be in the bouquet. Note that if there are fewer than $l_i$ tulips to the left or fewer than $r_i$ tulips to the right of tulip $i$, then all tulips from that side are still excluded from the bouquet (overflows are allowed).</p>

<p>Lieke wonders what the maximum number of tulips she can pick is if she picks her flowers optimally. Help her build a beautiful bouquet by finding the answer to her question!</p>

### 입력

<p>The first line of input contains a single integer $N$, the number of tulips growing along the road.</p>

<p>The following $N$ lines describe the information of the tulip protection law: the $i$th line contains two integers $l_i$ and $r_i$, representing the tulip protection constraints for tulip $i$.</p>

### 출력

<p>Output a single integer, the maximum number of tulips Lieke can pick while respecting the protection law.</p>

### 제한

<ul>
	<li>$1 \leq N \leq 2 \cdot 10^5$.</li>
	<li>$0 \leq l_i, r_i \leq N$ for $i = 0,1,\ldots, N-1$.</li>
</ul>

### 힌트

<p>Note that some of the samples are not valid input for all test groups.</p>

<p>In the first sample, if Lieke picks tulip $0$, she cannot pick the two tulips on the right. Picking tulip $1$ does not prohibit her from picking tulip $2$, but tulip $2$ prohibits her from picking tulip $1$, thus she cannot pick both of them. So, the maximum number of flowers Lieke can pick is $1$.</p>

<p>In the second sample, the maximum possible number of tulips Lieke can pick is $3$ and the way it can be obtained is shown in the picture. Other ways of picking tulips result in a smaller answer.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/a66eb05f-50fb-43fc-8a2c-dff04503f1b1/-/preview/" style="width: 512px; height: 147px;" /></p>