# [Platinum III] Film Critics - 21052

[문제 링크](https://www.acmicpc.net/problem/21052)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 94, 정답: 47, 맞힌 사람: 41, 정답 비율: 48.810%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>The premier of the anticipated action film <em>No Thyme to Fry</em> is right around the corner, and it is time to give early screenings to film critics so that they can review it. A small cinema has been selected to show these early screenings.&nbsp;</p>

<p>There are $n$ critics numbered from $1$ to $n$ scheduled to watch the movie early, and each of them will watch it separately. After watching it, they will immediately give it a score from $0$ to $m$. Susan, the cinema owner, has carefully looked at every critic&#39;s social media and already knows that the $i$th critic thinks the movie is worth a score of $a_i$. However, the $i$th critic will not simply give the movie a score of $a_i$ like you would expect, because they also take into account the scores that the other critics gave. Here is how they behave:</p>

<ol>
	<li>The first critic to arrive will be so happy that they are the first to review the movie that they will give it a score of $m$ regardless of their initial opinion.</li>
	<li>Every subsequent critic will look at the average score given by the previous critics. If this number is smaller than or equal to the initial opinion $a_i$ then the critic will give it a score of $m$, otherwise they will give it a $0$.</li>
</ol>

<p>Susan thinks the critics&#39; behaviour is ridiculous. She has watched the movie, and it is clearly worth a score of exactly $k/n$ and nothing else! But Susan is the owner of the cinema, so she gets to decide in what order to invite the critics. Your task is to find a permutation of $1,2, \dots, n$ so that if the critics arrive in this order the average score will be exactly $k/n$.</p>

### 입력

<p>The first line of input contains three integers $n$, $m$ and $k$ ($1 \leq n \leq 2 \cdot 10^5$, $1 \leq m \leq 10^4$, $0 \leq k \leq n \cdot m$). &nbsp;The second line contains the $n$ integers $a_1, a_2, \ldots, a_n$ ($0 \le a_i \le m$ for each $i$), the $n$ critic scores as described above.</p>

### 출력

<p>If the critics can be ordered in such a way that the resulting average score is exactly $k/n$, then output $n$ integers $p_1, \ldots, p_n$ ($1 \le p_i \le n$), where $p_i$ indicates that the $i$th critic to visit the cinema is the critic numbered $p_i$. &nbsp;This list of integers should be a permutation such that the average score given by the critics is $k/n$. &nbsp;If there are multiple solutions any one will be accepted.</p>

<p>Otherwise, if there is no such way to order the critics, output &quot;<code>impossible</code>&quot;.</p>