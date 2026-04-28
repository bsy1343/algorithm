# [Silver III] Magical Runes - 24928

[문제 링크](https://www.acmicpc.net/problem/24928)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 106, 정답: 87, 맞힌 사람: 73, 정답 비율: 87.952%

### 분류

수학, 문자열, 애드 혹, 비트마스킹

### 문제 설명

<p>You maintain a very nice collection of magical runes. They generally come in two types, type&nbsp;<code>A</code>&nbsp;and type&nbsp;<code>B</code>.</p>

<p>You have arranged your runes on a shelf to show them off. Because they are magical runes, they change each day. That is, at the start of each day the leftmost rune will switch its type (i.e. from&nbsp;<code>A</code>&nbsp;to&nbsp;<code>B</code>&nbsp;or from&nbsp;<code>B</code>&nbsp;to&nbsp;<code>A</code>, depending on its type just before the start of the day). Every other rune will only change if the type of the rune to its left changes from&nbsp;<code>B</code>&nbsp;to&nbsp;<code>A</code>.</p>

<p>For example, if you have three runes initially arranged like&nbsp;<code>ABBAA</code>, then at the start of the next day only the leftmost rune will change and the sequence will look like&nbsp;<code>BBBAA</code>. After another day, the leftmost rune will change, but then the second rune from the left will change because the rune beside it changed from&nbsp;<code>B</code>&nbsp;to&nbsp;<code>A</code>. But then the third rune will also change for the same reason. And then the fourth rune will also change! That is, after the changes at the start of this day the runes will look like&nbsp;<code>AAABA</code>.</p>

<p>Your task is the following. Given the initial states $S$ of an initial arrangement of runes and given a number of days&nbsp;𝐷D, you should determine the states of the runes after $D$ days have elapsed.</p>

### 입력

<p>Input consists of a single line that first begins with a string $S$ followed by an integer $D$. The length of $S$ will be between&nbsp;$1$&nbsp;and&nbsp;$30$&nbsp;(inclusive) and $S$ will consist only of characters&nbsp;<code>A</code>&nbsp;and&nbsp;<code>B</code>. The value&nbsp;$D$&nbsp;satisfies&nbsp;$0&le;D&lt;2^{30}$.</p>

<p>Finally, you are also guaranteed that the rightmost rune does not change from&nbsp;<code>B</code>&nbsp;to&nbsp;<code>A</code>&nbsp;at the start of any of the&nbsp;$D$&nbsp;days that you are to consider.</p>

### 출력

<p>Display a single string showing the states of the runes after $D$ days have elapsed, given they started in state $S$.</p>