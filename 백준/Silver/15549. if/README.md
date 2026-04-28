# [Silver V] if - 15549

[문제 링크](https://www.acmicpc.net/problem/15549)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 3023, 정답: 1546, 맞힌 사람: 1460, 정답 비율: 53.033%

### 분류

애드 혹

### 문제 설명

<p>다음 프로그램을 실행시켰을 때, &quot;<code>true</code>&quot;를 출력하는 변수 <code>x</code>의 자료형과 값을 찾는 프로그램을 작성하시오.</p>

<pre class="brush:java; toolbar:false;">
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ??? x = ???;
        if (x != 0 &amp;&amp; x == -x) {
            System.out.println(&quot;true&quot;);
        } else {
            System.out.println(&quot;false&quot;);
        }
    }
}
</pre>

<p>실행 환경은 BOJ 채점 서버의 Java 실행 환경과&nbsp;같다.</p>

### 입력

<p>입력은 없다.</p>

### 출력

<p>첫째 줄에 변수 <code>x</code>의 자료형과 값을 공백으로 구분해 출력한다. 자료형은 <code>int</code>와 <code>long</code>만 가능하다. 출력한 값이 자료형에 알맞지 않은 경우에는 틀리게 된다.</p>

<p>값은 아래 소스가 런타임 에러 없이 읽을 수 있는 값을 의미한다.</p>

<pre class="brush:java; toolbar:false;">
String val = &quot;유저가 출력한 값&quot;;
// int의 경우
int temp = Integer.parseInt(val);
// long의 경우
long temp = Long.parseLong(val);</pre>

### 힌트

<p>예제는 문제의 정답이 아니다.</p>

<p>이 문제에서 설명하는 프로그램은 C++에서 Java로 변경되었다. 따라서, 채점 번호가 10936345 이하인 제출에서&nbsp;<code>long long</code>을 출력한 소스는 <code>long</code>으로 변경해 채점한다.</p>