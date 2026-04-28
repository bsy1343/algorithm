# [Silver I] 通学経路 - 5601

[문제 링크](https://www.acmicpc.net/problem/5601)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 108, 정답: 72, 맞힌 사람: 71, 정답 비율: 68.932%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p>太郎君の住んでいるJOI市は， 南北方向にまっすぐに伸びる a 本の道路と， 東西方向にまっすぐに伸びる b 本の道路により， 碁盤の目の形に区分けされている．</p>

<p>南北方向の a 本の道路には， 西から順に 1, 2, ... , a の番号が付けられている． また， 東西方向の b 本の道路には， 南から順に 1, 2, ... , b の番号が付けられている． 西から i 番目の南北方向の道路と， 南から j 番目の東西方向の道路が交わる交差点を (i, j) で表す．</p>

<p>太郎君は， 交差点 (1, 1) の近くに住んでおり， 交差点 (a, b) の近くのJOI高校に自転車で通っている． 自転車は道路に沿ってのみ移動することができる． 太郎君は， 通学時間を短くするため， 東または北にのみ向かって移動して通学している．</p>

<p>現在， JOI市では， n 個の交差点 (x<sub>1</sub>, y<sub>1</sub>), (x<sub>2</sub>, y<sub>2</sub>), ... , (x<sub>n</sub>, y<sub>n</sub>) で工事を行っている． 太郎君は工事中の交差点を通ることができない．</p>

<p>太郎君が交差点 (1, 1) から交差点 (a, b) まで， 工事中の交差点を避けながら， 東または北にのみ向かって移動して通学する方法は何通りあるだろうか． 太郎君の通学経路の個数 m を求めるプログラムを作成せよ．</p>

### 입력

<p>入力ファイルの1行目には， 空白を区切りとして2個の整数 a, b が書かれている． これは， 南北方向の道路の本数と， 東西方向の道路の本数を表す． a, b は 1 ≦ a, b ≦ 16 をみたす．</p>

<p>2行目には, 工事中の交差点の個数を表す整数 n が書かれている． n は 1 ≦ n ≦ 40 をみたす．</p>

<p>続く n 行 (3行目から n+2 行目) には， 工事中の交差点の位置が書かれている． i+2 行目には空白で区切られた整数 x<sub>i</sub>, y<sub>i</sub>&nbsp;が書かれており， 交差点 (x<sub>i</sub>, y<sub>i</sub>) が工事中であることを表す． x<sub>i</sub>, y<sub>i</sub>&nbsp;は 1 ≦ x<sub>i</sub>, y<sub>i</sub>&nbsp;≦ 16 をみたす．</p>

### 출력

<p>提出する出力ファイルは， 太郎君の通学経路の個数 m だけを含む1行からなる．</p>

### 힌트

<p>下図は a=5, b=4, n=3 で， 工事中の交差点が (2,2), (2,3), (4,2) の場合を表している．</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/5601.%E2%80%85%E9%80%9A%E5%AD%A6%E7%B5%8C%E8%B7%AF/c6870505.png" data-original-src="https://upload.acmicpc.net/f43494b6-714a-4a30-bdfc-c9ffdbd3afd7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 247px; height: 166px;" /></p>

<p>この場合， 通学経路は m=5 通りある． 5通りの通学経路を全て図示すると， 以下の通り．</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/5601.%E2%80%85%E9%80%9A%E5%AD%A6%E7%B5%8C%E8%B7%AF/b08489a2.png" data-original-src="https://upload.acmicpc.net/0ce36717-268d-4da3-be27-450e88fd8378/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 247px; height: 166px;" /></p>