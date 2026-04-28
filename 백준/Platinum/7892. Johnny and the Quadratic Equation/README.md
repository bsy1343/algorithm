# [Platinum II] Johnny and the Quadratic Equation - 7892

[문제 링크](https://www.acmicpc.net/problem/7892)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 18, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

백트래킹, 많은 조건 분기, 수학, 정수론, 재귀

### 문제 설명

<p>Johnny recently learned about this whole quadratic equation thing. Being an avid young programmer, he immediately wrote the following code that was supposed to help in his homework:</p>

<pre>
#include&lt;cstdio&gt;
int main() {
    unsigned int a,b,c,x=0;
    scanf(&quot;%u %u %u&quot;,&amp;a,&amp;b,&amp;c);
    do {
        if (a*x*x+b*x+c==0) {
            puts(&quot;YES&quot;);
            return 0;
        }
        x++;
    } while(x);
    puts(&quot;NO&quot;);
    return 0;
}</pre>

<p>where all calculations are performed on unsigned 32-bit integers (in other words, modulo 232). But, well, it turned out that this code runs rather slow, even on his recently updated monster gaming rig. Maybe you could help him?</p>

### 입력

<p>The input contains several test cases. The first line contains an integer t (t &le; 10<sup>4</sup>) denoting the number of test cases. Then t tests follow, each of them consisting of three space separated integers a, b and c (0 &le; a, b, c &lt; 2<sup>32</sup>).</p>

### 출력

<p>For each test case output the answer of the program above.</p>