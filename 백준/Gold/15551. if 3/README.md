# [Gold IV] if 3 - 15551

[문제 링크](https://www.acmicpc.net/problem/15551)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 507, 정답: 318, 맞힌 사람: 265, 정답 비율: 65.432%

### 분류

애드 혹, 해 구성하기, 해싱

### 문제 설명

<p>다음 프로그램을 실행시켰을 때, &quot;<code>true</code>&quot;를 출력하는 길이가 N인 문자열&nbsp;<code>a, b</code>&nbsp;를&nbsp;찾는 프로그램을 작성하시오.</p>

<pre class="brush:java; toolbar:false;">
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if (!a.equals(b) &amp;&amp; a.hashCode() == b.hashCode()) {
            System.out.println(&quot;true&quot;);
        } else {
            System.out.println(&quot;false&quot;);
        }
    }
}</pre>

<p>실행 환경은 BOJ 채점 서버의 Java 실행 환경과&nbsp;같다.</p>

### 입력

<p>첫째 줄에 문자열의 길이 N (2 &le; N &le; 100)이 주어진다.</p>

### 출력

<p>첫째 줄에 문자열 <code>a</code>, 둘째 줄에 문자열 <code>b</code>를 출력한다.</p>

<p>문자열 <code>a</code>와 <code>b</code>는 <code>java.util.Scanner</code>의 <code>next</code>메소드로 입력받을 수 있어야 한다.</p>

### 힌트

<p>예제는 이 문제의 정답이 아니다.</p>