# [Silver III] Cowculations - 6486

[문제 링크](https://www.acmicpc.net/problem/6486)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 35, 정답: 17, 맞힌 사람: 12, 정답 비율: 44.444%

### 분류

수학, 구현, 문자열, 사칙연산

### 문제 설명

<p>A primitive cow culture was discovered by noted anthropologist Dr. Bo Vine. &nbsp;Hundreds of computation tablets were unearthed in a pasture somewhere near Dallas. &nbsp;Dr. Vine managed to decipher the mystery of the tablets when he realized they represented mathematical calculations. &nbsp;He says &quot;I&#39;ve always suspected that cows are smarter than they lead us to believe and here&#39;s the proof. &nbsp;The big breakthrough was realizing that they are not able to do math by cownting on their fingers, but they are able to think on their feet. &nbsp;But now I have hundreds of these tablets and I need help in verifying my hypothesis.&quot; &nbsp;</p>

<p>Problem Statement: Write a program that helps Dr. Vine verify his hypothesis. &nbsp;This problem statement describes how he thinks the tablets should be interpreted. &nbsp;Each tablet contains six lines and each line contains a sequence of cow symbols. &nbsp;The first two lines represent cow numbers, the next three represent operations on those numbers and the sixth represents the result. Cow numbers make use of four symbols: V U C and D most closely represent the marks made by the cow hooves, so we will use them to represent the symbols. &nbsp;The numbers on the first two lines of a tablet are always a sequence of 5 of these symbols, and the number on the sixth line of a tablet is always a sequence of 8 of these symbols.&nbsp;</p>

<p>To interpret the cow calculations one must keep track of two numbers, hereafter referred to as Num1 and Num2. &nbsp;Originally Num1 is equal to the number on line 1 of a tablet and Num2 is equal to the number on line 2 of a tablet. &nbsp;However the value of Num2 can change as a result of the<br />
operations. &nbsp;There are four possible operations, represented by the symbols A, R, L, and N. &nbsp;</p>

<p>Operation &nbsp;A&#39; causes Num2 to become the &quot;sum&quot; of Num1 and Num2, using this addition table:</p>

<pre>
 A  | V    U    C    D
-----------------------
 V  | V    U    C    D
 U  | U    C    D   V,U
 C  | C    D   V,U  U,U
 D  | D   V,U  U,U  C,U</pre>

<p>The first symbol in a result box represents the result of the addition. The second symbol in a box represents a carry symbol. &nbsp;</p>

<p>For example U &nbsp;A&#39; V = U and C &nbsp;A&#39; C = V with a carry of U.&nbsp;</p>

<p>Examples of cow addition are: &nbsp;</p>

<p>VUCDV &nbsp; A&#39; &nbsp;VUCDV &nbsp;= &nbsp;VDUCV &nbsp;and &nbsp; DVVCU &nbsp; A&#39; &nbsp;CVUCU &nbsp;= UUVCVC.</p>

<p>Operation R causes Num2 to have its symbols shifted right one position, with the rightmost symbol being lost and a &nbsp;V&#39; being placed into the leftmost position. &nbsp;For example VVCDU would become VVVCD. &nbsp;Operation L causes Num2 to have its symbols shifted left one position, with the leftmost symbol being kept and a &nbsp;V&#39; placed into the rightmost position. &nbsp;For example VVCDU would become VVCDUV. &nbsp;N is the null operation.&nbsp;It has no effect on Num2.</p>

<p>After the operations have been performed on Num1 and Num2 the final value of Num2 is hopefully the value marked on the sixth line of the tablet. &nbsp;If the final value of Num2 does not make use of 8 symbols then it is padded with V&#39;s on the left (VDCCC becomes VVVVDCCC).</p>

<p>Dr. Vine says &quot;I have already verified that all the tablets conform to the hypothesis in terms of the format of the tablets, number of lines and symbols, types of symbols, etc. &nbsp;But I need to verify that the result of the mathematical operation described on lines 1 through 5 is indeed on line 6.&quot;</p>

### 입력

<p>The first line contains an integer N between 1 and 10 describing how many tablets are represented. The next 6 * N lines represent the N<br />
tablets as described in the problem statement.</p>

### 출력

<p>There should be N+2 lines of output. The first line of output should read COWCULATIONS OUTPUT. There will then be one line of<br />
output for each tablet that states either &quot;Yes&quot; (the tablet follows Dr. Vine&#39;s hypothesis) or &quot;No&quot; (the tablet does not follow Dr. Vine&#39;s hypothesis). The final line of output should read &quot;END OF OUTPUT&quot;.</p>