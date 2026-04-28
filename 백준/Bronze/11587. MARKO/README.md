# [Bronze II] MARKO - 11587

[문제 링크](https://www.acmicpc.net/problem/11587)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 251, 정답: 183, 맞힌 사람: 164, 정답 비율: 73.543%

### 분류

구현, 문자열

### 문제 설명

<p>Good old Marko came across a new feature on his mobile phone &ndash; T9 input! His phone has a keyboard consisting of numbers looking like this:</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/11587.%E2%80%85MARKO/ca553272.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11587/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:128px; width:145px" /></p>

<p>In order to input a word using this keyboard, one needs to press a key multiple times for the required letter. More specifically, if the required letter is the first letter mapped to the key, one key press is needed, if it&rsquo;s the second, two key presses are needed and so on. For instance, if we want to input the word &ldquo;giht&rdquo;, we will press the following keys: g-4 i-444 h-44 t-8. The new possibility Marko discovered enables you to input text more easily because you don&rsquo;t need several presses per letter anymore, just one. The software will try to figure out what word from the dictionary you are trying to input.</p>

<p>Marko is quite sceptical of new technologies (at least new for him) and he is afraid that errors will be frequent. That is the reason why he decided to test his hypothesis that the errors are frequent. Marko knows by heart the whole dictionary in the mobile phone. The dictionary consists of N words consisting of lowercase letters from the English alphabet, the total length of the word not exceeding 1 000 000 characters. He will give an array of key presses S, of total length at most 1 000, and wants to know how many words from the dictionary can be mapped to the given array of key presses if the T9 input feature is used.</p>

### 입력

<p>The first line of input contains the integer N, the number of words in the dictionary. (1 &le; N &le; 1 000). Each of the following N lines contains a single word. The last line of input contains the string S (1 &le; |S| &le; 1000) consisting of digits 2-9.</p>

### 출력

<p>The first and only line of output must contain the number of words from the dictionary possible to construct from the letters on the keys determined by the string S.</p>

### 힌트

<p>Clarification of the first example: &ldquo;mono&rdquo; is the only word that has all the letters located on key 6.</p>

<p>Clarification of the second example: The first letter of both words is located on key 5 and the second letter of both words is located on key 2.</p>