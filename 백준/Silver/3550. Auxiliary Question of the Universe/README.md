# [Silver II] Auxiliary Question of the Universe - 3550

[문제 링크](https://www.acmicpc.net/problem/3550)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 77, 정답: 38, 맞힌 사람: 28, 정답 비율: 56.000%

### 분류

문자열, 애드 혹, 해 구성하기

### 문제 설명

<p>As you probably know, scientists already discovered the Ultimate question of life, the Universe, and everything, and it is &quot;What do you get if you multiply six by nine?&quot;. Not satisfied by this, the scientists contracted a small Magrateyan company to construct a mini-computer to find out some more specific question (they named it <em>auxiliary</em>), which can theoretically shed more light on life, the Universe or something else.</p>

<p>This computer was built, but unluckily (although not unexpectedly) the result of computation was corrupted and partially lost. Finally the computer constructors managed to receive a string, which is a part of the correct question. After thorough analysis the constructors started to believe that the original result can be reconstructed from the string by adding some letters to it without the string letters being reordered or removed. Also they believe that the correct result is an arithmetic expression (as with the Ultimate question), but since the question is auxiliary, it contains no multiplication, only addition. More precisely, it should correspond to the following grammar:</p>

<pre>
&lt;expression&gt; ::= &lt;term&gt; | &lt;term&gt; <code>+</code> &lt;expression&gt;
&lt;term&gt; ::= &lt;number&gt; | <code>(</code> &lt;expression&gt; <code>)
</code>&lt;number&gt; ::= <code>0</code> ... <code>9</code> [ &lt;number&gt; ]</pre>

<p>The constructors do not want to risk again, and they need your help to give just something to their clients. They ask you to reconstruct the question based on the corrupted computer answer which they managed to retrieve.&nbsp;</p>

### 입력

<p>The input file contains exactly one line --- the corrupted auxiliary question. It is a non-empty string which is at most 1000 symbols long. This string contains only symbols <code>+</code>, <code>(</code>, <code>)</code>, and <code>0</code>, ..., <code>9</code>.</p>

### 출력

<p>Output the reconstructed auxiliary question. It&#39;s guaranteed that there exists a correct question of less than 5000 symbols and your solution must also be shorter than that. If there is more than one solution, output any one.</p>