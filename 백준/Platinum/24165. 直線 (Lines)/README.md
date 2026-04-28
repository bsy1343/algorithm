# [Platinum II] 直線 (Lines) - 24165

[문제 링크](https://www.acmicpc.net/problem/24165)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 131, 정답: 24, 맞힌 사람: 16, 정답 비율: 20.513%

### 분류

오일러 지표 (χ=V-E+F), 기하학

### 문제 설명

<p>平面上の N 本の直線 ℓ<sub>1</sub>, ℓ<sub>2</sub>, . . . , ℓ<sub>N</sub> が入力として与えられる．これらの直線によって平面を分 割したときの領域の個数を求めるプログラムを作成せよ．ただし， これらの直線には重複があ るかもしれない．</p>

<p>下図では 14 個の領域に分割されている．</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/e2659e16-2f3b-47d2-8dbf-ea009e84b395/-/preview/" style="width: 298px; height: 219px;" /></p>

### 입력

<p>入力は N + 1 行からなる．最初の行に N (1 &le; N &le; 1000) の値が書かれている．i + 1 行目 (1 &le; i &le; N) には，4 つの整数 a<sub>i</sub>, b<sub>i</sub>, c<sub>i</sub>, d<sub>i</sub> (0 &le; a<sub>i</sub>, b<sub>i</sub>, c<sub>i</sub>, d<sub>i</sub> &le; 1000,(a<sub>i</sub>, b<sub>i</sub>) &ne;&nbsp;(c<sub>i</sub>, d<sub>i</sub>)) が空白を区切りとして書かれている．これは，直線 ℓ<sub>i</sub> が， 点 P<sub>i</sub>(a<sub>i</sub>, b<sub>i</sub>) と点 Q<sub>i</sub>(c<sub>i</sub>, d<sub>i</sub>) を結ぶ直線であることを意味している．</p>

### 출력

<p>標準出力に 1 行で領域の個数を出力せよ．</p>

### 힌트

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/8ebf28e1-b879-4c89-9e6d-441e5f36041c/-/preview/" style="width: 493px; height: 493px;" /></p>