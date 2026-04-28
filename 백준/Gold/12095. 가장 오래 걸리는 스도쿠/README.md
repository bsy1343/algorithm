# [Gold III] 가장 오래 걸리는 스도쿠 - 12095

[문제 링크](https://www.acmicpc.net/problem/12095)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 5098, 정답: 1219, 맞힌 사람: 707, 정답 비율: 18.884%

### 분류

애드 혹, 해 구성하기, 런타임 전의 전처리

### 문제 설명

<p>백준이는 <a href="https://www.acmicpc.net/problem/2580">2580번 스도쿠 문제</a>를 풀기 위해 아래와 같은 코드를 작성했다.</p>

<pre class="brush:c++; toolbar:false;">
#include &lt;iostream&gt;
using namespace std;
int a[10][10];
bool c[10][10];
bool c2[10][10];
bool c3[10][10];
int n=9;
int cnt=0;
int square(int x, int y) {
    return (x/3)*3+(y/3);
}
bool go(int z) {
    cnt += 1;
    if (cnt &gt;= 10000000) {
        return true;
    }
    if (z == 81) {
        for (int i=0; i&lt;n; i++) {
            for (int j=0; j&lt;n; j++) {
                cout &lt;&lt; a[i][j] &lt;&lt; &#39; &#39;;
            }
            cout &lt;&lt; &#39;\n&#39;;
        }
        return true;
    }
    int x = z/n;
    int y = z%n;
    if (a[x][y] != 0) {
        return go(z+1);
    } else {
        for (int i=1; i&lt;=9; i++) {
            if (c[x][i] == 0 &amp;&amp; c2[y][i] == 0 &amp;&amp; c3[square(x,y)][i]==0) {
                c[x][i] = c2[y][i] = c3[square(x,y)][i] = true;
                a[x][y] = i;
                if (go(z+1)) {
                    return true;
                }
                a[x][y] = 0;
                c[x][i] = c2[y][i] = c3[square(x,y)][i] = false;
            }
        }
    }
    return false;
}
int main() {
    for (int i=0; i&lt;n; i++) {
        for (int j=0; j&lt;n; j++) {
            cin &gt;&gt; a[i][j];
            if (a[i][j] != 0) {
                c[i][a[i][j]] = true;
                c2[j][a[i][j]] = true;
                c3[square(i,j)][a[i][j]] = true;
            }
        }
    }
    go(0);
    return 0;
}
</pre>

<p>변수 <code>cnt</code>에 저장된 값이 가장 큰 스도쿠 퍼즐을 출력하는 프로그램을 작성하시오.&nbsp;문제의 점수는 <code>cnt</code>에 저장된 값이다.</p>

### 입력

<p>입력은 없다.</p>

### 출력

<p>총 9개의 줄에 스도쿠 퍼즐을 출력한다. 빈 칸은 0으로 출력한다. (2580번 문제의 입력을 출력한다)</p>

<p>만약, 풀 수 없는 스도쿠 퍼즐을 출력한 경우에는 틀렸습니다를 받게 된다.</p>