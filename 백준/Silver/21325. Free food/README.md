# [Silver II] Free food - 21325

[문제 링크](https://www.acmicpc.net/problem/21325)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 145, 정답: 79, 맞힌 사람: 65, 정답 비율: 52.419%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색

### 문제 설명

<p>Tonight Hsara is going out for a dinner at a restaurant with his organisation and Hsara is thinking about the chances of someone else paying for the dinner. Exactly one person will pay for the entire dinner (everyone&#39;s food), but not any person. It is only allowed to pay for dinner if no supperior (possibly indirect, for example, your boss&#39; boss) in the organisation is present at the table.</p>

<p>The organisation consists of $N$ people numbered from $1$ to $N$. Each person, except for the CEO, has exactly one boss. Given each person&#39;s boss and a list of people present at the table, determine how many people are able to pay for the dinner.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/21325.%E2%80%85Free%E2%80%85food/aab800e1.png" data-original-src="https://upload.acmicpc.net/522f8b91-f56a-4ab0-a225-7aea3b7c9fde/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 83px; height: 143px;" /></p>

<p style="text-align: center;">Figure 1:&nbsp;Illustration of the organisation in the first sample.</p>

### 입력

<p>The first line consists of two integers, $N$ - the number of people in the organisation and $1 \le M \le N$ - the number of people at the table.</p>

<p>The second line consists of $N$ integers. The $i$:th integer is the boss of person $i$. 0 means that person $i$ is the CEO. There will be exactly one CEO.</p>

<p>The third line consists of $M$ integers indicating the people present at the table.</p>

### 출력

<p>Print an integer - the number of people at the table who would be able to pay for the dinner.</p>

### 제한

<ul>
	<li>$2 \le N \le 100\,000$</li>
</ul>

### 힌트

<p>In the first sample person 1 and person 2 can pay. Person 3 can&#39;t pay because person 1 is at the table.</p>

<p>In the second sample person 5 is the CEO and at the table. Therefore only person 5 can pay.</p>