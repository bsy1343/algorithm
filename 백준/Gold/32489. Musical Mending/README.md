# [Gold V] Musical Mending - 32489

[문제 링크](https://www.acmicpc.net/problem/32489)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 138, 정답: 93, 맞힌 사람: 78, 정답 비율: 68.421%

### 분류

삼분 탐색, 정렬

### 문제 설명

<p>Shortly before the concert starts, you notice that your piano is completely out of tune! Having the ability of relative pitch, you are able to discern the difference between the pitch of any piano key to the first piano key. While this does not help you find the absolute pitch, you decide to at least tune the keys relative to each other. To do this, you need to make sure that the pitch of each key is exactly one higher than the key before it and one lower than the key after it. As the concert will start shortly, you need to minimize the total tuning effort, which is the sum of the absolute changes in pitch you apply to each key. For example, Figure M.1 illustrates a solution for Sample Input 3, resulting in a total tuning effort of 23.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32489.%E2%80%85Musical%E2%80%85Mending/e4ebef16.png" data-original-src="https://boja.mercury.kr/assets/problem/32489-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 329px; height: 350px;"></p>

<p style="text-align: center;">Figure M.1: Visualization of Sample Input 3.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($2 \leq n \leq 10^5$), the number of keys on the piano. </li>
	<li>One line with $n$ integers $t_1,\dots,t_n$ ($-2 \cdot 10^5 \leq t_i \leq 2 \cdot 10^5$), where $t_i$ describes the difference in pitch between the $i$th key and the first key. The first integer $t_1$ is always $0$.</li>
</ul>

### 출력

<p>Output the minimal total tuning effort.</p>