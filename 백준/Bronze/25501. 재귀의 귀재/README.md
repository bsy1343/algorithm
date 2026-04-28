# [Bronze II] 재귀의 귀재 - 25501

[문제 링크](https://www.acmicpc.net/problem/25501)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 38107, 정답: 21194, 맞힌 사람: 18332, 정답 비율: 56.652%

### 분류

구현, 문자열, 재귀

### 문제 설명

<p>정휘는 후배들이 재귀 함수를 잘 다루는 재귀의 귀재인지 알아보기 위해 재귀 함수와 관련된 문제를 출제하기로 했다.</p>

<p>팰린드롬이란, 앞에서부터 읽었을 때와 뒤에서부터 읽었을 때가 같은 문자열을 말한다. 팰린드롬의 예시로 AAA, ABBA, ABABA 등이 있고, 팰린드롬이 아닌 문자열의 예시로 ABCA, PALINDROME 등이 있다.</p>

<p>어떤 문자열이 팰린드롬인지 판별하는 문제는 재귀 함수를 이용해 쉽게 해결할 수 있다. 아래 코드의 isPalindrome 함수는 주어진 문자열이 팰린드롬이면 1, 팰린드롬이 아니면 0을 반환하는 함수다.</p>

<pre>
<code>#include &lt;stdio.h&gt;
#include &lt;string.h&gt;</code>

<code>int recursion(const char *s, int l, int r){
    if(l &gt;= r) return 1;
    else if(s[l] != s[r]) return 0;
    else return recursion(s, l+1, r-1);
}</code>

<code>int isPalindrome(const char *s){
    return recursion(s, 0, strlen(s)-1);
}</code>

<code>int main(){
    printf(&quot;ABBA: %d\n&quot;, isPalindrome(&quot;ABBA&quot;)); // 1
    printf(&quot;ABC: %d\n&quot;, isPalindrome(&quot;ABC&quot;));   // 0
}</code></pre>

<p>정휘는 위에 작성된 isPalindrome 함수를 이용하여 어떤 문자열이 팰린드롬인지 여부를 판단하려고 한다.</p>

<p>구체적으로는, 문자열 $S$를 isPalindrome 함수의 인자로 전달하여 팰린드롬 여부를 반환값으로 알아낼 것이다. 더불어 판별하는 과정에서 recursion 함수를 몇 번 호출하는지 셀 것이다.</p>

<p>정휘를 따라 여러분도 함수의 반환값과 recursion 함수의 호출 횟수를 구해보자.</p>

### 입력

<p>첫째 줄에 테스트케이스의 개수 $T$가 주어진다. ($1 \leq T \leq 1\,000$)</p>

<p>둘째 줄부터 $T$개의 줄에 알파벳 대문자로 구성된 문자열 $S$가 주어진다. ($1 \leq \vert S\vert \leq 1\,000$)</p>

### 출력

<p>각 테스트케이스마다, isPalindrome 함수의 반환값과 recursion 함수의 호출 횟수를 한 줄에 공백으로 구분하여 출력한다.</p>

### 힌트

<p>Python 3</p>

<pre>
<code>def recursion(s, l, r):
    if l &gt;= r: return 1
    elif s[l] != s[r]: return 0
    else: return recursion(s, l+1, r-1)</code>

<code>def isPalindrome(s):
    return recursion(s, 0, len(s)-1)</code>

<code>print(&#39;ABBA:&#39;, isPalindrome(&#39;ABBA&#39;))
print(&#39;ABC:&#39;, isPalindrome(&#39;ABC&#39;))</code></pre>

<p>Java 15</p>

<pre>
<code>public class Main{
    public static int recursion(String s, int l, int r){
        if(l &gt;= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args){
        System.out.println(&quot;ABBA: &quot; + isPalindrome(&quot;ABBA&quot;));
        System.out.println(&quot;ABC: &quot; + isPalindrome(&quot;ABC&quot;));
    }
}</code></pre>