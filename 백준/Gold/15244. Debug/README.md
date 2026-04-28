# [Gold IV] Debug - 15244

[문제 링크](https://www.acmicpc.net/problem/15244)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 126, 정답: 59, 맞힌 사람: 51, 정답 비율: 54.255%

### 분류

수학, 구현, 정수론, 누적 합, 조화수

### 문제 설명

<p dir="ltr">Se&aacute;n is trying to debug a piece of his code. First he creates an array of N integers and fills it with zeros. Then he repeatedly calls the following procedure which he has written in C++:</p>

<pre dir="ltr">
void something( int jump ) {
 int i = 0;
 while( i &lt; N ) {
   seq[i] = seq[i] + 1;
   i = i + jump;
 }
}</pre>

<p>As you can see, this procedure increases by one all elements in the array whose indices are divisible by <code>jump</code>.</p>

<p>Se&aacute;n calls the procedure exactly K times, using the sequence X<sub>1</sub> X<sub>2</sub> X<sub>3</sub> ... X<sub>k</sub> as arguments.</p>

<p>After this, Se&aacute;n has a list of Q special parts of the array he needs to check to verify that his code is working as it should be. Each of this parts is defined by two numbers, L and R (L &le; R) the left and right bound of the special part. To check the code, Se&aacute;n must compute the sum of all elements of seq between and including L and R. In other words seq[L] + seq[L+1] + seq[L+2] + &hellip; + seq[R]. Since he needs to know the answer in advance in order to check it, he asked you to help him.</p>

### 입력

<p dir="ltr">The first line of input contains two integers, N (1 &le; N &le; 10<sup>6</sup>), size of the array, and K (1 &le; K &le; 10<sup>6</sup>), number of calls to <code>something</code> Se&aacute;n makes.The second line contains K integers: X<sub>1</sub> X<sub>2</sub> X<sub>3</sub> ... X<sub>k</sub> , arguments passed to the procedure. (1 &le; X<sub>i</sub> &lt; N).</p>

<p>Next line contains one integer Q (1 &le; Q &le; 10<sup>6</sup>), number of special parts of the array Se&aacute;n needs to check.</p>

<p>Next Q lines contain two integers each L<sub>i</sub> and R<sub>i</sub> (0 &le; L<sub>i</sub> &le; Ri &lt; N), bounds of each special part.</p>

### 출력

<p dir="ltr">The output should contain exactly Q lines. The ith line should contain the sum of the elements seq[L<sub>i</sub>] + seq[L<sub>i</sub> +1] + seq[L<sub>i</sub> +2] + &hellip; + seq[R<sub>i</sub>].</p>

### 힌트

<p>Example 1 description: The procedure is called with arguments 1, 1, 2, 1. After that the array contains values {4, 3, 4, 3, 4, 3, 4, 3, 4, 3}. Sum of indices 2 to 6 (inclusive) is 4+3+4+3+4 = 18.</p>

<p>Example 2 description: After the procedure calls, the array is {3, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1}.</p>