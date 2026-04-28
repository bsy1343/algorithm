# [Platinum V] Better and faster! - 7871

[문제 링크](https://www.acmicpc.net/problem/7871)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 22, 정답: 3, 맞힌 사람: 3, 정답 비율: 37.500%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>You probably know this story already. You wake up in the morning and your head feels twice the size. You have a vague memory of a program your boss asked you to write. After you have logged in, you see a main piece of code you wrote yesterday.</p>

<pre>
unsigned int checksum (char str[], int len) {
&nbsp;   unsigned int r = 0;
&nbsp;   for (int k=0; k&lt;8*len; k++) {               // iterate over bits of str
&nbsp;       if ((r &amp; (1&lt;&lt;31)) != 0) r = (r &lt;&lt; 1) ^ 0x04c11db7;
&nbsp;                          else r = (r &lt;&lt; 1);   // do some magic
&nbsp;       if (str[k/8] &amp; 1&lt;&lt;(7-k%8))              // if the k-th bit of str is set,
&nbsp;           r ^= 1; // then flip the last bit of r
&nbsp;   }
&nbsp;   return r;
}</pre>

<p>&ldquo;Good&rdquo;, you think, &ldquo;I commented it well&rdquo;. Still, you have some issues with understanding the &ldquo;do some magic&rdquo; part. But well, the function is called <code>checksum</code>, and &mdash; lo and behold &mdash; it really computes a kind of a checksum of a given string.</p>

<p>You recall the rest of your task. You were supposed to compute this checksum for a given string and then for slightly modified versions of this string. Actually, the rest of your program also looks quite decent.</p>

<pre>
#include &lt;stdio.h&gt;

int main() {
&nbsp;   char str[1000001],c;
&nbsp;   int TESTS,n,changes,p;
&nbsp;   for (scanf (&quot;%d&quot;, &amp;TESTS); TESTS&gt;0; TESTS--) {
&nbsp;       scanf (&quot;%d %s&quot;, &amp;n, str);               // read the input
&nbsp;       printf (&quot;%u\n&quot;, checksum(str, n));      // compute checksum for original string
&nbsp;       for (scanf (&quot;%d&quot;, &amp;changes); changes&gt;0; changes--) {
&nbsp;           scanf (&quot;%d %c&quot;, &amp;p, &amp;c);            // apply the change
&nbsp;           str[p-1] = c;
&nbsp;           printf (&quot;%u\n&quot;, checksum(str, n));  // compute checksum for modified string
&nbsp;       }
&nbsp;   }
}</pre>

<p>And then you recall the final issue. The program works perfectly well, but also terribly slow. You just have to make it work faster. Much faster. As you have heard that Java is a better and safer programming language, you even made an equivalent Java version (see the last page), which works even slower (strange, eh?).</p>

### 입력

<p>The input contains several test cases. The first line of the input contains a positive integer Z &le; 20, denoting the number of test cases. Then Z test cases follow.</p>

<p>Below by a character, we mean a single small or large letter, or a digit.</p>

<p>In the first line of an input instance, there is a natural number n (1 &le; n &le; 10<sup>6</sup>) and a string s, separated by a single space. String s consists of n characters. The second line of the input contains&nbsp;one integer t (0 &le; t &le; 10<sup>5</sup>) denoting the number of changes to be applied to string s. Each of the next t lines consists of a natural number p &isin; [1, n] and a character c, separated by a single space. It encodes a change of a string: the p-th character of s has to be replaced by c.</p>

### 출력

<p>You have to produce the same output the program above would do. In other words, you have to output t + 1 lines, each containing a natural number being a checksum. The first checksum has to be computed for an original string s, the remaining ones are to be computed after each change made to s.</p>

### 힌트

<p>Java Version of The Program</p>

<pre>
import java.util.Scanner;

public class Compute {

&nbsp; &nbsp; static long checksum (byte[] str, int len) {
&nbsp; &nbsp; &nbsp; &nbsp; int r = 0;
&nbsp; &nbsp; &nbsp; &nbsp; for (int k=0; k&lt;8*len; k++) {                  // iterate over bits of str
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if ((r &amp; (1&lt;&lt;31)) != 0) r = (r &lt;&lt; 1) ^ 0x04c11db7;
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; else r = (r &lt;&lt; 1);                         // do some magic
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if ((str[k/8] &amp; 1&lt;&lt;(7-k%8)) != 0)          // if the k-th bit of str is set,
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; r ^= 1;                                // then flip the last bit of r
&nbsp; &nbsp; &nbsp; &nbsp; }
&nbsp; &nbsp; &nbsp; &nbsp; long rr = (r&lt;0 ? r+0x100000000L : r);          // Java does not have unsigned int
&nbsp; &nbsp; &nbsp; &nbsp; return rr;
&nbsp; &nbsp; }

&nbsp; &nbsp; public static void main(String[] args) {
&nbsp; &nbsp; &nbsp; &nbsp; Scanner in = new Scanner(System.in);
&nbsp; &nbsp; &nbsp; &nbsp; for (int TESTS = in.nextInt(); TESTS&gt;0; TESTS--) {
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; int n = in.nextInt();                      // read the input
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; byte[] str = in.next().getBytes();         // compute checksum for
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; System.out.println (checksum(str,n));      // original string
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; for (int changes = in.nextInt(); changes&gt;0; changes--) {
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; int p = in.nextInt();                  // apply the change
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; byte c = in.next().getBytes()[0];
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; str[p-1] = c;
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; System.out.println (checksum(str,n));  // compute checksum for
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; } // modified string
&nbsp; &nbsp; &nbsp; &nbsp; }
&nbsp; &nbsp; }
}</pre>