# [Platinum III] Young Zebra - 25032

[문제 링크](https://www.acmicpc.net/problem/25032)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 1024 MB

### 통계

제출: 54, 정답: 17, 맞힌 사람: 16, 정답 비율: 53.333%

### 분류

깊이 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>요즘 젊은 얼룩말 사이에서는, 가죽의 흑백 무늬를 새롭게 바꾸는 수술이 대인기다. 젊은 얼룩말인 정우도 이 수술로 가죽의 무늬를 바꾸는 것에 관심이 많다.</p>

<p>이 수술을 받기 전에 수술을 받는 얼룩말이 원하는 크기의 흑백 패턴을 준비 해야 하고, 수술은 이 패턴을 무한히 이어 붙인 것을 기준으로 한다. 예를 들어, $2 \times 3$크기의 패턴과 이 패턴을 이어 붙인 그림이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25032.%E2%80%85Young%E2%80%85Zebra/a111d212.png" data-original-src="https://upload.acmicpc.net/d3b66f0d-1aa1-424b-90b9-31027629a88f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 189px; height: 133px;" /></p>

<p style="text-align: center;">그림 1: $2 \times 3$크기의 패턴</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25032.%E2%80%85Young%E2%80%85Zebra/bcf21c77.png" data-original-src="https://upload.acmicpc.net/342e8b64-e888-4cc0-9374-e203583d03ee/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 307px; height: 190px;" /></p>

<p style="text-align: center;">그림 2 : 위의 패턴을 무한히 이어 붙인 것의 일부.&nbsp;빨간 직사각형은 위의 패턴을 나타내며, 뒤틀림 없이 그대로 맞춰서 이어 붙인다.</p>

<p style="text-align: center;">격자는 시술할 때 없어지므로 이상하게 시술이 될 것 같다는 걱정은 하지 않으셔도 됩니다.</p>

<p>정우는 먼저 패턴을 정한 후, 무한히 이어 붙여보는 것을 해보려고 한다. 이 때, 중요한 것은 무한히 이어 붙인 다음 각 칸이 이루는 연결 성분의 크기이다. 이것은 미관상 매우 중요한 문제다. 만약 색이 같은 두 칸이 상하좌우로 붙어있다면 그 두 칸은 같은 연결 성분에 들어가는 것이다.</p>

<p>그림 2에서 각 칸이 속한 연결 성분의 크기를 구해보면, 검은색 칸이 속한&nbsp;연결 성분의 크기는 모두 $24$이고, 흰색 칸이 속한 연결 성분에는 무한히 많은&nbsp;칸이 포함된다. 즉, 크기가 무한대이다. 주어진 패턴을 무한히 이어 붙인 다음&nbsp;각 칸이 속한 연결 성분의 크기를 구하는 프로그램을 작성하라.</p>

### 입력

<p>첫 번째 줄에 얼룩 패턴의 크기를 나타내는 두 정수 $N$, $M$($1 &le; N, M &le; 400$)이&nbsp;공백 하나로 구분되어 주어진다.</p>

<p>다음 $N$개&nbsp;줄의&nbsp;각 줄에는 길이가 $M$인&nbsp;문자열이 주어진다. 모든 문자열은 &lsquo;<code>B</code>&rsquo;또는 &lsquo;<code>W</code>&rsquo;로 이루어진 문자열이다. &lsquo;<code>B</code>&rsquo;는 검은색, &lsquo;<code>W</code>&rsquo;는 흰색을 나타낸다.</p>

### 출력

<p>총 $N$개의&nbsp;줄에 걸쳐 정답을 출력한다. $i$번째 줄에는 $M$개의 수가&nbsp;공백 하나로 구분되어 출력되어야 하고, 그 중 $j$번째 수는&nbsp;입력에서 $i$번째 행 $j$번째 열에&nbsp;주어진 칸이 속한 연결 성분의 크기여야 한다. 만약 그 크기가 무한히 크다면 -1로 출력해야 한다.</p>