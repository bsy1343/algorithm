# [Platinum III] GGGCCCDDD - 28348

[문제 링크](https://www.acmicpc.net/problem/28348)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 102, 정답: 77, 맞힌 사람: 50, 정답 비율: 74.627%

### 분류

수학, 정수론

### 문제 설명

<p>2012년 8월 18일. 시대를 앞서가는 프로그래밍 연구소 Algospot에서는 새로운 슈퍼컴퓨터 AEX를 개발했다. Algospot의 연구원 altertain은 AEX의 성능을 알아보기 위해서 GCD(최대공약수)의 합을 계산하는 간단한 프로그램을 작성했다.</p>

<pre>
int gcd(int a, int b) {
    return b ? gcd(b, a%b) : a;
}

sum = 0;
for (a = 1; a &le; N; a++)
    for (b = 1; b &le; N; b++)
        sum = sum + gcd(a, b);
</pre>

<blockquote>
<p>&ldquo;흠&hellip; 이 정도는 금방 계산하겠지&hellip;?&rdquo;</p>
</blockquote>

<p>슈퍼컴퓨터 AEX는 눈깜빡할 사이에 계산을 마치고 답을 출력했다.</p>

<blockquote>
<p>&ldquo;음&hellip; 그럼 루프를 하나 늘려볼까&hellip;?&rdquo;</p>
</blockquote>

<pre>
sum = 0;
for (a = 1; a &le; N; a++)
    for (b = 1; b &le; N; b++)
        for (c = 1; c &le; N; c++)
            sum = sum + gcd(gcd(a, b), c);
</pre>

<blockquote>
<p>&ldquo;와&hellip; 엄청 빠르다!&rdquo;</p>
</blockquote>

<p>슈퍼컴퓨터 AEX는 이것도 순식간에 계산해냈다.</p>

<blockquote>
<p>&ldquo;뭐하고 있어?&rdquo;</p>
</blockquote>

<p>Algospot에 놀러온 Afocuns의 연구원 rainpunch가 altertain에게 물었다.</p>

<blockquote>
<p>&ldquo;어 왔어? 이번에 우리 연구소에서 슈퍼컴퓨터를 새로 개발했거든. 그거 테스트해보고 있었어. 여기 코드에 루프 하나씩 늘려보던 중&hellip;&rdquo;</p>
</blockquote>

<p>똑똑한 연구원인 rainpunch가 코드를 보더니 한마디 했다.</p>

<blockquote>
<p>&ldquo;뭐야? 이런 건 루프 $10$개라도 금방 계산하겠다&hellip; 아니? 음&hellip; $1000$개라도 금방 하겠는데?&rdquo;</p>

<p>&ldquo;뭐라고!? 그럼 루프 $M$ 개에 대해 누가 더 빨리 계산하나 진검승부 한 번 해볼까!?&rdquo;</p>

<p>&ldquo;좋아. 내가 의지의 차이를 제대로 보여주지.&rdquo;</p>

<p>&ldquo;흥! 컴퓨터의 천재, 박수를 드려요!&rdquo;</p>
</blockquote>

<p>rainpunch가 떠올린 방법은 무엇일까? 우리도 한 번 좋은 방법을 찾아보자.</p>

### 입력

<p>입력은 $T$개의 테스트 케이스로 구성된다. 입력의 첫 줄에는 $T$가 주어진다.</p>

<p>각 테스트 케이스에 대해, 한 줄에 정수 $N$과 $M$ ($2 &le; N, M &le; 1000$)이 공백으로 구분되어 주어진다.</p>

### 출력

<p>각 테스트 케이스마다 한 줄에 하나씩 답을 출력한다. 단, 답이 매우 클 수 있으므로 답을 $1\,000\,000\,007$로 나눈 나머지를 출력한다.</p>

### 힌트

<p>$N = 10$, $M = 4$인 경우, 아래처럼 계산해볼 수 있다.</p>

<pre>
sum = 0;
for (a = 1; a &le; 10; a++)
    for (b = 1; b &le; 10; b++)
        for (c = 1; c &le; 10; c++)
            for (d = 1; d &le; 10; d++)
                sum = sum + gcd(gcd(gcd(a, b), c), d);</pre>