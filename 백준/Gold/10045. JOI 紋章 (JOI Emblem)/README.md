# [Gold IV] JOI 紋章 (JOI Emblem) - 10045

[문제 링크](https://www.acmicpc.net/problem/10045)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 147, 정답: 86, 맞힌 사람: 77, 정답 비율: 62.097%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>情報オリンピック日本委員会では，台湾大会に向かう選手を応援するために新しい JOI 旗を作成することにした．</p>

<p>JOI 旗は，正方形が縦に M 行，横に N 列並んだ形をしており，各正方形には J，O，I のいずれかの文字が 1 つずつ書かれている．</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/10045.%E2%80%85JOI%E2%80%85%E7%B4%8B%E7%AB%A0%E2%80%85(JOI%E2%80%85Emblem)/c6bebdee.png" data-original-src="https://www.acmicpc.net/upload/images3/joi1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:181px; width:289px" /></p>

<p style="text-align:center">JOI 旗の例</p>

<p>情報オリンピック日本委員会は JOI 旗とは別に JOI 紋章というものを決めている．JOI 紋章は，正方形が縦に 2 行，横に 2 列並んだ形をしており，各正方形には J，O，I のいずれかの文字が 1 つずつ書かれている．</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/10045.%E2%80%85JOI%E2%80%85%E7%B4%8B%E7%AB%A0%E2%80%85(JOI%E2%80%85Emblem)/be4b821b.png" data-original-src="https://www.acmicpc.net/upload/images3/joi2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:128px; width:124px" /></p>

<p style="text-align:center">JOI 紋章の例</p>

<p>JOI 旗に含まれる JOI 紋章の個数とは，JOI 旗に含まれる縦 2 行，横 2 列の領域のうち，その領域の J，O，I の配置が JOI 紋章と (回転や裏返しをせずに) 一致しているものの個数のことである．条件を満たす縦2 行，横 2 列の領域同士が重なっていてもそれらを別々に数えるものとする．</p>

<p>情報オリンピック日本委員会は古い JOI 旗と 1 枚の白紙を持っている．白紙は JOI 旗を構成する正方形1 個分の大きさで，J，O，I のうち好きな 1 文字を書き込むことができる．情報オリンピック日本委員会は以下のいずれか 1 つの操作をして，新しい JOI 旗を作成することにした．</p>

<p>古い JOI 旗に対して何も操作せず，そのまま新しい JOI 旗とする．白紙は使用しない．<br />
白紙に 1 文字書き込み，古い JOI 旗のいずれかの正方形に重ねて貼り付けることで古い JOI 旗のうち 1 箇所を変更する．変更後の JOI 旗を新しい JOI 旗とする．</p>

<p>情報オリンピック日本委員会は新しい JOI 旗に含まれる JOI 紋章の個数をできるだけ多くしたいと思っている．あなたは新しい JOI 旗に含まれる JOI 紋章の個数の最大値を求めることになった．</p>

<p>古い JOI 旗と JOI 紋章の情報が与えられたとき，新しい JOI 旗に含まれる JOI 紋章の個数の最大値を求めるプログラムを作成せよ．</p>

### 입력

<p>標準入力から以下のデータを読み込め．</p>

<ul>
	<li>1 行目には 2 個の整数 M, N が空白を区切りとして書かれている．これは JOI 旗が正方形が縦に M行，横に N 列並んだ形であることを表している．</li>
	<li>続く M 行の各行には，それぞれ N 文字からなる文字列が書かれている．各文字は J，O，I のいずれかであり，M 行のうち上から i 行目 (1 &le; i &le; M) に書かれている文字列の左から j 文字目 (1 &le; j &le; N)は古い JOI 旗の上から i 行目，左から j 列目の正方形に書かれている文字を表す．</li>
	<li>続く 2 行の各行には，それぞれ 2 文字からなる文字列が書かれている．各文字は J，O，I のいずれかであり，2 行のうち上から i 行目 (1 &le; i &le; 2) に書かれている文字列の左から j 文字目 (1 &le; j &le; 2) はJOI 紋章の上から i 行目，左から j 列目の正方形に書かれている文字を表す．</li>
</ul>

### 출력

<p>標準出力に，新しい JOI 旗に含まれる JOI 紋章の個数の最大値を表す整数を 1 行で出力せよ．</p>

### 제한

<ul>
	<li>2 &le; M &le; 1 000．</li>
	<li>2 &le; N &le; 1 000．</li>
</ul>