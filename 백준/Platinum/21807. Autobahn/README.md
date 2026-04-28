# [Platinum III] Autobahn - 21807

[문제 링크](https://www.acmicpc.net/problem/21807)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 48, 정답: 13, 맞힌 사람: 13, 정답 비율: 54.167%

### 분류

누적 합, 정렬, 스위핑

### 문제 설명

<p>There are $N$ people testing their racing cars on notorious <em>autobahn</em> where limits do not exist. In this task however limits do exist. So we kindly ask you to restrain yourself from submitting exponential complexity solutions.</p>

<p>Person $i$ came to <em>autobahn</em> at the beginning of minute $l_i$, paid for $t_i$ minutes of stay and left at the end of minute $r_i$. Unfortunately some stayed for longer than that they have paid for. Administration of <em>autobahn</em> decided not to be very harsh and charge them only for those extra minutes in which there were at least $K$ people on <em>autobahn</em>.</p>

<p>In a rush of generosity, administration decided to introduce <em>happy hour</em> i.e. interval of continuous $X$ minutes for which they won&rsquo;t be paying extra charges. They picked <em>happy hour</em> so that the sum of extra charges that won&rsquo;t be paid is maximal possible. Determine that sum.</p>

### 입력

<p>First line contains integers $N$, $K$ and $X$ ($K \le N$) from task description.</p>

<p>Next $N$ lines contain integers $l_i$, $t_i$ and $r_i$ ($l_i \le r_i$) from task description.</p>

### 출력

<p>Print the required sum in a single line.</p>

### 힌트

<p><strong>First sample explanation:</strong> <em>Happy hour</em> will span from 4th until the 7th minute. Inside that interval, first person should&rsquo;ve paid extra for the 4th minute and second, third and fourth person should&rsquo;ve paid for 6th and 7th minute.</p>