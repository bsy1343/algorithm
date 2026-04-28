# [Platinum IV] Round and round it goes - 27719

[문제 링크](https://www.acmicpc.net/problem/27719)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 63, 정답: 15, 맞힌 사람: 14, 정답 비율: 26.415%

### 분류

수학, 애드 혹, 정수론, 해 구성하기, 소수 판정, 런타임 전의 전처리

### 문제 설명

<p>Last month, Dexter created the best infinite loop ever. However, his sister DeeDee used his computer to check her Facebook page and meanwhile she managed to erase two numbers from Dexter&rsquo;s program.</p>

<p>Here is the damaged program in Java. (Check the input file for the same code in other languages.)</p>

<pre>
public class R {  
 
  static boolean magic(int x) {  
    int foo = 0;  
    while (x &gt; 1)  
      for (int y=2; ; ++y) {  
        if (y==x) return foo&le;0;  
        if (magic(y) &amp;&amp; x%y==0) { x/=y; ++foo; break; }  
      }  
    return true;  
  }  
 
  public static void main(String[] argv) {  
    int where = ??????;  
    int step = ??????;  
    int best = where;  
    while (step != 0) {  
      where += step;  
      if (where &lt; best) { best=where; System.out.println(&quot;*&quot;); }  
      if (!magic(where)) break;  
    }  
  }  
}
</pre>

<p>In both data sets your task is to replace the two &ldquo;??????&rdquo; strings by a pair of integers W and S. Note that these integers must be in a valid range for a signed 32-bit integer variable (e.g., int in Java). That is, your values must satisfy &minus;2<sup>31</sup> &le; W,S &le; 2<sup>31</sup> &minus; 1.</p>

<p>As the solution to the easy data set R1, submit any two integers W and S such that the program will run in an infinite loop if where is initialized to W and step to S.</p>

<p>As the solution to the hard data set R2, submit two integers W and S such that the program will run in an infinite loop if where is initialized to W and step to S. Additionally, out of all pairs (W,S) that satisfy the first condition, your values W and S must be such that the number of stars printed by the program is maximized. (Any such pair will be accepted.)</p>

### 입력

<p>For your convenience, the input file contains the program in multiple languages. All these programs are equivalent.</p>

<ul>
	<li><a href="https://upload.acmicpc.net/14be1c58-3734-4981-990f-08a35dd4e5b0/">r.java</a> <a href="https://upload.acmicpc.net/15dc067e-f807-4f18-b209-6aebd70c2978/">r.py</a> <a href="https://upload.acmicpc.net/0d5fec68-1e5a-4b45-ad9f-d690595e0e54/">r.cpp</a></li>
</ul>

### 출력

<p>Output a single line with two space-separated integers W and S.</p>