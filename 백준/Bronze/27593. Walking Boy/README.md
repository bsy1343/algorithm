# [Bronze II] Walking Boy - 27593

[문제 링크](https://www.acmicpc.net/problem/27593)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 202, 정답: 155, 맞힌 사람: 138, 정답 비율: 80.702%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>One of the SWERC judges has a dog named Boy. Besides being a good competitive programmer, Boy loves fresh air, so she wants to be walked at least twice a day. Walking Boy requires $120$ <strong>consecutive</strong> minutes. Two walks cannot overlap, but one can start as soon as the previous one has finished.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/5eb65505-4063-40ef-89ae-35e5c855487d/-/preview/" style="width: 350px; height: 229px;" /></p>

<p style="text-align: center;">Boy before and after getting ACCEPTED on this problem.</p>

<p>Today, the judge sent $n$ messages to the SWERC Discord server. The $i$-th message was sent $a_i$ minutes after midnight. You know that, when walking Boy, the judge does not send any messages, but he can send a message right before or right after a walk. Is it possible that the judge walked Boy at least twice today?</p>

<p>Note that a day has $1440$ minutes, and a walk is considered to happen <em>today</em> if it starts at a minute $s &ge; 0$ and ends right before a minute $e &le; 1440$. In that case, it must hold that $e - s = 120$ and, for every $i = 1, 2, \dots , n$, either $a_i &le; $s or $a_i &ge; e$.</p>

<p> </p>

### 입력

<p>Each test contains multiple test cases. The first line contains an integer $t$ ($1 &le; t &le; 100$) &mdash; the number of test cases. The descriptions of the $t$ test cases follow.</p>

<p>The first line of each test case contains an integer $n$ ($1 &le; n &le; 100$) &mdash; the number of messages sent by the judge.</p>

<p>The second line of each test case contains $n$ integers $a1_, a_2, \dots , a_n$ ($0 &le; a_1 &lt; a_2 &lt; \cdots &lt; a_n &lt; 1440$) &mdash; the times at which the messages have been sent (in minutes elapsed from midnight).</p>

### 출력

<p>For each test case, output one line containing <code>YES</code> if it is possible that Boy has been walked at least twice, and <code>NO</code> otherwise.</p>

### 힌트

<p>In the <strong>first test case</strong>, the judge has sent a message at each time multiple of $100$ (excluding $0$). It is impossible that he has walked Boy even once.</p>

<p>In the second test case, the times are the same as above, but $500$ and $1000$ are missing. The judge could have walked Boy, for instance, during the time intervals $[440, 560]$ and $[980, 1100]$. The situation is illustrated in the picture below, where the walks are represented by green intervals.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/95ecba34-defc-477d-8885-6fd8e0c69ca8/-/preview/" style="width: 609px; height: 164px;" /></p>

<p>In the <strong>third test case</strong>, the times are the same as in the first test case, but $1000$ is missing. The judge could have walked Boy at most once.</p>

<p>In the <strong>fourth test case</strong>, Boy could have been walked during the time intervals $[739, 859]$ and $[859, 979]$.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/37194989-a513-43b8-b727-a28cb838eeb7/-/preview/" style="width: 612px; height: 152px;" /></p>