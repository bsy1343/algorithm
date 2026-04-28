# [Gold II] Retwinting twinter - 19750

[문제 링크](https://www.acmicpc.net/problem/19750)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 36, 정답: 12, 맞힌 사람: 8, 정답 비율: 47.059%

### 분류

이분 탐색, 브루트포스 알고리즘, 그리디 알고리즘, 구현, 문자열

### 문제 설명

<p>Project twinter (from words &lt;&lt;the winter&gt;&gt;) is a social network in which people can write about the winter that is coming. Each message in this network is called a twint. Beforehand the length of each twint was limited to 140 characters, but recently this limit was raised to 280.</p>

<p>If a user needs to post a longer message, she traditionally breaks it up into a series of several twints. In the end of each twint she puts its number and the total number of twints in the chain, for example:</p>

<p><code>Winter!.. The peasant breathes a sigh, (1/2)</code></p>

<p><code>renews his sledge, and makes his way. (2/2)</code></p>

<p>Creators of twinter decided to reformat old twint chains automatically according with the new limit of 280 characters. Help them reformat the given chain, placing it into as little twints as possible. Words (that is, sequences of non-space characters) may not be broken up between twints.</p>

### 입력

<p>The first line contains positive integer $n$ ($1 \le n \le 5000$) --- the number of twints in the initial chain.</p>

<p>Each of the next $n$ lines contains a twint. Its length is at most 140 characters and it ends with the string &lt;&lt; ($i$/$n$)&gt;&gt;, where $i$ is the number of this twint. Twints do not start with a space and do not contain two sequential spaces. Twints can only contain spaces, English letters, digits and punctuation marks (with ASCII codes from 33 to 63).</p>

### 출력

<p>In the first line output the number $m$ --- the number of twints of your reformatted shortest chain.</p>

<p>Then output the twints of your chain, one per line. They may not start with a space or contain two sequential spaces. They must end with the string &lt;&lt; ($i$/$m$)&gt;&gt;, as in the input. The sequence of words in your chain must be the same as in the initial one.</p>