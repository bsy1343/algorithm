# [Gold V] ピザ - 5571

[문제 링크](https://www.acmicpc.net/problem/5571)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 59, 정답: 52, 맞힌 사람: 45, 정답 비율: 90.000%

### 분류

정렬, 이분 탐색

### 문제 설명

<p>JOI ピザでは，市の中心部を通る全長 d メートルの環状線の沿線上でピザの宅配販 売を行っている．</p>

<p>JOI ピザは，環状線上に n 個の店舗 S<sub>1</sub>, &middot; &middot; &middot; , S<sub>n</sub> を持つ．本店は S<sub>1</sub> である．S<sub>1</sub> から S<sub>i</sub> まで，時計回りに環状線を移動したときの道のりを d<sub>i</sub> メートルとおく．d<sub>2</sub>, &middot; &middot; &middot; , d<sub>n</sub> は 1 以上 d &minus; 1 以下の整数である．d<sub>2</sub>, &middot; &middot; &middot; , d<sub>n</sub> は全て異なる．</p>

<p>ピザの注文を受けると, ピザが冷めないように，宅配先までの移動距離がもっとも 短い店舗でピザを焼き宅配する．</p>

<p>宅配先の位置は 0 以上 d &minus; 1 以下の整数 k で表される．これは，本店 S<sub>1</sub> から宅配 先までに時計回りで環状線を移動したときの道のりが k メートルであることを意味 する．ピザの宅配は環状線に沿って行われ，それ以外の道を通ることは許されない． ただし，環状線上は時計回りに移動しても反時計回りに移動してもよい</p>

<p>例えば，店舗の位置と宅配先の位置が下図のようになっている場合 (この例は「入 出力の例」の例 1 と対応している)，</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5571.%E2%80%85%E3%83%94%E3%82%B6/bdcc8f39.png" data-original-src="https://upload.acmicpc.net/86756a17-6e3b-47f6-96d9-6be1ae2c6a93/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 298px; height: 253px;" /></p>

<p>宅配先 1 にもっとも近い店舗は S<sub>2</sub> なので，店舗 S<sub>2</sub> から宅配する．このとき，店 舗からの移動距離は 1 である．また，宅配先 2 にもっとも近い店舗は S<sub>1</sub>(本店) なの で，店舗 S<sub>1</sub>(本店) から宅配する．このとき，店舗からの移動距離は 2 である．</p>

<p>環状線の全長 d，JOI ピザの店舗の個数 n，注文の個数 m, 本店以外の位置を表す n &minus; 1 個の整数 d<sub>2</sub>, &middot; &middot; &middot; , d<sub>n</sub>，宅配先の場所を表す整数 k<sub>1</sub>, &middot; &middot; &middot; , k<sub>m</sub> が与えられたとき，各 注文に対する宅配時の移動距離 (すなわち，最寄店舗から宅配先までの道のり) の全 注文にわたる総和を求めるプログラムを作成せよ．</p>

### 입력

<p>1 行目には環状線の全長を表す正整数 d (2 &le; d &le; 1000000000 = 10<sup>9</sup>) ，2 行目には 店舗の個数を表す正整数 n (2 &le; n &le; 100000) ，3 行目には注文の個数を表す正整数 m (1 &le; m &le; 10000) が書かれている．4 行目以降の n &minus; 1 行には本店以外の店舗の位 置を表す整数 d<sub>2</sub>, d<sub>3</sub>, &middot; &middot; &middot; , d<sub>n</sub> (1 &le; d<sub>i</sub> &le; d &minus; 1) がこの順に書かれており，n + 3 行目以降 の m 行には宅配先の場所を表す整数 k<sub>1</sub>, k<sub>2</sub>, &middot; &middot; &middot; , k<sub>m</sub> (0 &le; k<sub>i</sub> &le; d &minus; 1) がこの順に書かれ ている．</p>

### 출력

<p>宅配時の移動距離の総和を表す 1 つの整数のみを含む 1 行から なる．</p>