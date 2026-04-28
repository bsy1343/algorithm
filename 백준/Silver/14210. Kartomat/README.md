# [Silver V] Kartomat - 14210

[문제 링크](https://www.acmicpc.net/problem/14210)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 32 MB

### 통계

제출: 119, 정답: 90, 맞힌 사람: 86, 정답 비율: 75.439%

### 분류

구현, 문자열

### 문제 설명

<p>A ticket machine is a device similar to an ATM and was introduced by Croatian Railways in order to make purchasing train tickets easier. The first step in buying a ticket is choosing the destination​ of your journey. The destination can be one of N destinations offered in advance, names of local and worldwide places. You choose your destination by typing its name letter by letter. By entering each additional letter, the number of possible destinations reduces.</p>

<p>The initial appearance of the keyboard on the screen is shown in the picture. We will represent it as four arrays of characters of length 8.&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/14210.%E2%80%85Kartomat/6e6628f5.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/14210.%E2%80%85Kartomat/6e6628f5.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14210/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-12-30%20%EC%98%A4%ED%9B%84%204.14.39.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:120px; width:482px" /></p>

<p>After choosing each letter, the keyboard changes its appearance. Only letters that can be chosen in the next step are left active (depending on the destinations still possible to choose). The remaining letter that can&rsquo;t be chosen are replaced with the character &ldquo;*&rdquo;.</p>

<p>Write a programme that will, for N given destinations and the first few letters (not all of them) of the chosen destination, output the appearance of the keyboard before entering the next letter. You will never be given the entire word.&nbsp;</p>

### 입력

<p>The first line contains the integer N (1 &le; N &le; 50) from the task. Each of the following N lines contains one string of at most 100 characters that contains only uppercase letters of the English alphabet. The last line contains the string that represents the first few letters of the chosen destination.&nbsp;</p>

### 출력

<p>You must output the appearance of the keyboard described in the task.&nbsp;</p>

### 힌트

<p>Clarification of the example : After entering the letters &ldquo;ZA&rdquo;, the third letter can be &ldquo;G&rdquo; if we want a ticket to Zagreb, &ldquo;D&rdquo; if we want a ticket to Zadar, and &ldquo;B&rdquo; if we want a ticket to Zabok.&nbsp;</p>