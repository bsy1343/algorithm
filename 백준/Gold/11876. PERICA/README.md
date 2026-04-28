# [Gold III] PERICA - 11876

[문제 링크](https://www.acmicpc.net/problem/11876)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 277, 정답: 123, 맞힌 사람: 104, 정답 비율: 45.022%

### 분류

수학, 정렬, 정수론, 조합론, 모듈로 곱셈 역원

### 문제 설명

<ul>
	<li>&ldquo;I&rsquo;m stopping by Žnidar&scaron;ić&rsquo;s house, you play the piano, Perica.&rdquo;</li>
	<li>&rdquo;Ok, dad, I will!&rdquo;</li>
</ul>

<p>And so, Perica began playing the piano. His piano consists of N keys. Each key has a value written on it, a<sub>i</sub>. When Perica plays the piano, he presses exactly K different keys at the same time. The piano is a bit strange because, after pressing K keys at the same time, it will play only the key with the largest value. Perica is going to play each combination of K keys on the piano and he wants to know the sum of values of the keys that will be played.</p>

<p>Help Perica determine the remainder of that number modulo 1 000 000 007.</p>

### 입력

<p>The first line of input contains two integers N and K (1 &le; N &le; 100 000, 1 &le; K &le; 50).</p>

<p>The following line of input contains N integers a<sub>i</sub> (0 &le; a<sub>i</sub> &le; 10<sup>9</sup>).</p>

### 출력

<p>The first and only line of output must contain the required number from the task.</p>

### 힌트

<p>All selections of K keys are: [2, 4, 2], [2, 4, 3], [2, 4, 4], [2, 2, 3], [2, 2, 4], [2, 3, 4], [4, 2, 3], [4, 2, 4], [4, 3, 4], [2, 3, 4].</p>