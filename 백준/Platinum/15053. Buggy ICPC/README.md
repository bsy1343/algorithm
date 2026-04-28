# [Platinum IV] Buggy ICPC - 15053

[문제 링크](https://www.acmicpc.net/problem/15053)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 61, 정답: 37, 맞힌 사람: 32, 정답 비율: 66.667%

### 분류

그리디 알고리즘, 문자열, 애드 혹

### 문제 설명

<p>Alan Curing is a famous sports programmer. He is the creator of the theoretical model of computation known as the Alan Curing Machine (ACM). He&rsquo;s most famous for creating his own computer for programming competitions: the Integrated Computer for Programming Contests (ICPC). This computer has a specialized operating system with commands for submitting code and testing executables on sample inputs, an input generator, a wide display for debugging, and a very soft keyboard. However, as it happens even to the best, Alan&rsquo;s creation has a nasty bug. Every time Alan types a vowel on the ICPC, the content of the current line is reversed.</p>

<p>The bug has been extremely hard to track down, so Alan has decided to accept the challenge and use the computer as it is. He is currently training touch typing on the ICPC. For now, he is only typing strings using lowercase letters, and no spaces. When Alan types a consonant, it is appended to the end of the current line, as one would expect. When he types a vowel, however, the typed character is first added to the end of the line, but right after that the whole line is reversed. For example, if the current line has &ldquo;imc&rdquo; and Alan types &ldquo;a&rdquo; (a vowel), for a brief moment the line will become &ldquo;imca&rdquo;, but then the bug kicks in and turns the line into &ldquo;acmi&rdquo;. If after that he types the consonants &ldquo;c&rdquo;, &ldquo;p&rdquo; and &ldquo;c&rdquo;, in that order, the line becomes &ldquo;acmicpc&rdquo;.</p>

<p>When practicing, Alan first thinks of the text he wants to type, and then tries to come up with a sequence of characters he can type in order to obtain that text. He is having trouble, however, since he realized that he cannot obtain some texts at all (such as &ldquo;ca&rdquo;), and there are multiple ways of obtaining other texts (as &ldquo;ac&rdquo;, which is obtained whether he types &ldquo;ac&rdquo; or &ldquo;ca&rdquo;). Help Alan in his training by telling him in how many ways he can type each text he wishes to type. A way of typing a text T can be encoded by a string W with |T| characters such that if the characters are typed on the ICPC in the order they appear in W (i.e. W<sub>1</sub>, W<sub>2</sub>, . . . , W<sub>|T|</sub>) the final result is equal to T, considering ICPC&rsquo;s known bug. Two ways are considered different if they are encoded by different strings. The letters that trigger the bug in the ICPC when typed are &ldquo;a&rdquo;, &ldquo;e&rdquo;, &ldquo;i&rdquo;, &ldquo;o&rdquo; and &ldquo;u&rdquo;.</p>

### 입력

<p>The input consists of a single line that contains a non-empty string T of at most 10<sup>5</sup> lowercase letters, representing the text Alan wants to type on the ICPC.</p>

### 출력

<p>Output a single line with an integer representing the number of distinct ways Alan can type the desired text T considering ICPC&rsquo;s known bug.</p>