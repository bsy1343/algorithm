# [Gold V] Runes - 10557

[문제 링크](https://www.acmicpc.net/problem/10557)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 325, 정답: 68, 맞힌 사람: 46, 정답 비율: 19.247%

### 분류

문자열, 많은 조건 분기, 파싱

### 문제 설명

<p style="text-align: center;"><img alt="" src="/upload/images2/runes.png" style="height:53px; width:170px" /></p>

<p>You are helping an archaeologist decipher some runes. He knows that this ancient society used a Base 10 system, and that they never start a number with a leading zero. He&rsquo;s figured out most of the digits as well as a few operators, but he needs your help to figure out the rest.</p>

<p>The professor will give you a simple math expression. He has converted all of the runes he knows into digits. The only operators he knows are addition (+), subtraction (-), and multiplication (*), so those are the only ones that will appear. Each number will be in the range from &minus;999, 999 to 999, 999, and will consist of only the digits &lsquo;0&rsquo;&ndash;&lsquo;9&rsquo;, possibly a leading &lsquo;-&rsquo;, and a few &lsquo;?&rsquo;s. The &lsquo;?&rsquo;s represent a digit rune that the professor doesn&rsquo;t know (never an operator, an &lsquo;=&rsquo;, or a leading &lsquo;-&rsquo;). All of the &lsquo;?&rsquo;s in an expression will represent the same digit (0&ndash;9), and it won&rsquo;t be one of the other given digits in the expression.</p>

<p>Given an expression, figure out the value of the rune represented by the question mark. If more than one digit works, give the lowest one. If no digit works, well, that&rsquo;s bad news for the professor&mdash;it means that he&rsquo;s got some of his runes wrong. Output &minus;1 in that case.</p>

### 입력

<p>The sample data will start with the number of test cases T (1 &le; T &le; 100). Each test case will consist of a single line, of the form:</p>

<p style="text-align: center;">[number][op][number]=[number]</p>

<p>Each [number] will consist of only the digits &lsquo;0&rsquo;-&lsquo;9&rsquo;, with possibly a single leading minus &lsquo;-&rsquo;, and possibly some &lsquo;?&rsquo;s. No number will begin with a leading &lsquo;0&rsquo; unless it is 0, no number will begin with -0, and no number will have more than 6 characters (digits or ?s). The [op] will separate the first and second [number]s, and will be one of: +, - or *. The = will always be present between the second and third [number]s. There will be no spaces, tabs, or other characters. There is guaranteed to be at least one ? in every equation.</p>

### 출력

<p>Output the lowest digit that will make the equation work when substituted for the ?s, or output &minus;1 if no digit will work. Output no extra spaces or blank lines.</p>