# [Silver II] JOI ポスター (JOI Poster) - 24110

[문제 링크](https://www.acmicpc.net/problem/24110)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 102, 정답: 70, 맞힌 사람: 44, 정답 비율: 67.692%

### 분류

분할 정복, 구현, 재귀

### 문제 설명

<p>情報オリンピック日本委員会では，今年の日本情報オリンピック (JOI) の合宿を宣伝するために，ポス ターを作ることになった．JOI のロゴをモチーフにしたポスターが作られた．</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/24110.%E2%80%85JOI%E2%80%85%E3%83%9D%E3%82%B9%E3%82%BF%E3%83%BC%E2%80%85(JOI%E2%80%85Poster)/3fc131b2.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/24110.%E2%80%85JOI%E2%80%85%E3%83%9D%E3%82%B9%E3%82%BF%E3%83%BC%E2%80%85(JOI%E2%80%85Poster)/3fc131b2.png" data-original-src="https://upload.acmicpc.net/3f327de4-9c32-42c1-85c2-2545985b0770/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 164px; height: 162px;" /></p>

<p style="text-align: center;">JOI のロゴ</p>

<p>ポスターには，2<sup>N</sup> &times; 2<sup>N</sup> 個のアルファベットを正方形の形に印刷する．</p>

<p>N = 1 のときには，2<sup>N</sup> &times; 2<sup>N</sup> の正方形を 4 個の 2<sup>N&minus;1</sup> &times; 2<sup>N&minus;1</sup> の正方形に分け，左上の正方形にはアルファ ベットの J を，右上の正方形にはアルファベットの O を，左下の正方形にはアルファベットの I を印刷す る．また，右下の正方形には，大きさが 2<sup>N&minus;1</sup> &times; 2<sup>N&minus;1</sup> のポスターを印刷する．N = 0 のときには，アルファ ベットの J の一文字からなる大きさが 1 &times; 1 のポスターを印刷する．</p>

<p>以下に，N = 3 の場合の，大きさが 8 &times; 8 のポスターに印刷するアルファベットを表す．</p>

<pre style="text-align: center;">
JJJJOOOO
JJJJOOOO
JJJJOOOO
JJJJOOOO
IIIIJJOO
IIIIJJOO
IIIIIIJO
IIIIIIIJ</pre>

<p style="text-align: center;">N = 3 のポスター</p>

<p>完成したポスターの K 行目に印刷間違いが見つかった．</p>

<p>今年の日本情報オリンピックの合宿はすでに始まっている．再度ポスターの印刷を業者に依頼するには 十分な時間がない．そのため，正しい K 行目をポスターに貼り付けることによって，対応することにした．</p>

<p>入力として整数 N と K が与えられたときに，大きさが 2 N &times; 2 N のポスターの K 行目を出力するプログラ ムを作成せよ．</p>

### 입력

<p>標準入力から以下を読み込め．入力は 1 行からなり，ポスターの大きさを表す整数 N と出力する行を表 す K が空白区切りで書かれている．</p>

### 출력

<p>標準出力に，一行で，大きさが 2<sup>N</sup> &times; 2<sup>N</sup> のポスターの K 行目を出力せよ．</p>

### 제한

<ul>
	<li>0 &le; N &le; 20 ポスターの大きさ</li>
	<li>1 &le; K &le; 2 N 出力するポスターの行</li>
</ul>