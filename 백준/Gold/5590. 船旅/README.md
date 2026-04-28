# [Gold IV] 船旅 - 5590

[문제 링크](https://www.acmicpc.net/problem/5590)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 196, 정답: 167, 맞힌 사람: 134, 정답 비율: 86.452%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>JOI国には，n 島の島があり， 各島には 1 から n までの番号が付けられている． 現在，JOI国では各島の間を結ぶ航路網の整備が進んでいる．</p>

<p>あなたは，船舶の切符を扱っているチケットセンターに勤務している．JOI国には船舶を使って，できる限り安価に， 島と島の間を旅行したいと考えている人が沢山おり， 彼らは，出発地と目的地を注文票に記入して，あなたのところに送ってくる．&nbsp;</p>

<p>あなたの仕事は，客から注文票を受け取ったらすぐに， いくつかの船舶を乗り継いで， 出発地と目的地を結ぶ航路の中で， もっとも安価な運賃を計算し，客に伝えることである．</p>

<p>ただし，旅程によっては，船舶を使って旅行することが出来ない場合もある． そのときは『船舶を使って旅行することが出来ない』と客に伝える必要がある． また，JOI国では，島と島の間を結ぶ新しい船舶が，次々と運航を開始しており， あなたには，その情報が随時伝えられる． 客に返事をする際には，最新の情報に留意しなければならない．</p>

<p>入力として，客の注文票や新たに運航を開始した船舶の運航情報が与えられたときに， 客への返事を求めるプログラムを作成せよ．</p>

<p>なお，入力例１と出力例１に対する実行状況を，図１として図示している．</p>

### 입력

<p>入力の 1 行目には2つの整数 n, k (1 ≦ n ≦ 100, 1 ≦ k ≦ 5000) が書かれている． これは，島の数が n 島で，入力が k + 1 行からなることを表す．&nbsp;</p>

<p>i + 1 行目 (1 ≦ i ≦ k) には， 3 個または 4 個の整数が空白を区切りとして書かれている．</p>

<ul>
	<li>最初の数字が 0 のとき，この行は客の注文票を表す．
	<ul>
		<li>この行には3個の整数 0, a, b (1 ≦ a ≦ n, 1 ≦ b ≦ n, a &ne; b) が空白を区切りとして書かれている．</li>
		<li>これは，客が，島 a を出発地とし島 b を目的地とするような注文票を送ってきたことを表す．</li>
	</ul>
	</li>
	<li>最初の数字が 1 のとき，この行は新たに運航を開始した船舶の運航情報を表す．
	<ul>
		<li>この行には 4 個の整数 1, c, d, e (1 ≦ c ≦ n, 1 ≦ d ≦ n, c &ne; d, 1 ≦ e ≦ 1000000) が書かれている．</li>
		<li>これは島 c と島 d を往復する船舶が新たに運航を開始し， この船舶の島 c から島 d への運賃と，島 d から島 c への運賃が，共に e であることを表す．</li>
		<li>この行以降の注文票に対しては，この船舶も考慮して返事をしなければならない．</li>
	</ul>
	</li>
</ul>

<p>最初の段階では，船舶は一隻も運航していないものとする． 入力のうち，船舶の運航情報を表す行は 1000 行以下である． また，島と島の間に，複数の船舶が運航することがあることに注意せよ．</p>

### 출력

<p>入力のうち，注文票を表す行の数を m とおく．&nbsp;</p>

<p>提出する出力ファイルは m 行からなり， i 行目(1 ≦ i ≦ m)には， i 番目の注文票に対する返事を表す整数を書く．&nbsp;</p>

<p>すなわち， i 番目の注文票の出発地と目的地の間を，いくつかの船舶を乗り継いで旅行することが可能ならば， その運賃の合計の最小値を書く． 旅行することが不可能ならば，-1 を書く．</p>

### 힌트

<p>なお，入力例１と出力例１の船舶が運航を開始していく模様と客からの注文票に対する返答を，図１として以下に図示している．</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5590.%E2%80%85%E8%88%B9%E6%97%85/946f774f.png" data-original-src="https://upload.acmicpc.net/b9e6f73e-f6f1-499a-8a75-2db820652dcf/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /> <img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5590.%E2%80%85%E8%88%B9%E6%97%85/8f68af44.png" data-original-src="https://upload.acmicpc.net/6f0e5635-7743-4b66-8b62-8efbec75ee58/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /> <img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5590.%E2%80%85%E8%88%B9%E6%97%85/b721a609.png" data-original-src="https://upload.acmicpc.net/6c518da3-00d6-406a-b26e-fcaa041e2566/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /> <img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5590.%E2%80%85%E8%88%B9%E6%97%85/8f68af44.png" data-original-src="https://upload.acmicpc.net/6f0e5635-7743-4b66-8b62-8efbec75ee58/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /> <img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5590.%E2%80%85%E8%88%B9%E6%97%85/faeda88c.png" data-original-src="https://upload.acmicpc.net/e807cd6f-9db4-482e-b3cf-c16d5f8bc2f9/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /> <img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5590.%E2%80%85%E8%88%B9%E6%97%85/8f68af44.png" data-original-src="https://upload.acmicpc.net/6f0e5635-7743-4b66-8b62-8efbec75ee58/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /> <img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5590.%E2%80%85%E8%88%B9%E6%97%85/90cc3d45.png" data-original-src="https://upload.acmicpc.net/6506c599-a0d1-49b8-bbe2-df872780d109/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /> <img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5590.%E2%80%85%E8%88%B9%E6%97%85/8f68af44.png" data-original-src="https://upload.acmicpc.net/6f0e5635-7743-4b66-8b62-8efbec75ee58/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /> <img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5590.%E2%80%85%E8%88%B9%E6%97%85/9dcc4b2e.png" data-original-src="https://upload.acmicpc.net/1c55f827-5045-4b10-b97c-8014c52fbbdb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /> <img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5590.%E2%80%85%E8%88%B9%E6%97%85/8f68af44.png" data-original-src="https://upload.acmicpc.net/6f0e5635-7743-4b66-8b62-8efbec75ee58/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /> <img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5590.%E2%80%85%E8%88%B9%E6%97%85/8a861918.png" data-original-src="https://upload.acmicpc.net/2617a4d2-68a6-44b9-9eaf-cb05e368530a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /> <img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5590.%E2%80%85%E8%88%B9%E6%97%85/8f68af44.png" data-original-src="https://upload.acmicpc.net/6f0e5635-7743-4b66-8b62-8efbec75ee58/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /> <img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5590.%E2%80%85%E8%88%B9%E6%97%85/0645b4db.png" data-original-src="https://upload.acmicpc.net/ed6e3098-fe58-4379-8f16-2ac51eaa3bb8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /> <img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5590.%E2%80%85%E8%88%B9%E6%97%85/8f68af44.png" data-original-src="https://upload.acmicpc.net/6f0e5635-7743-4b66-8b62-8efbec75ee58/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /> <img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5590.%E2%80%85%E8%88%B9%E6%97%85/2f96ed0b.png" data-original-src="https://upload.acmicpc.net/d8d26759-313a-4a14-95ed-06eca8b6c0f0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /> <img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5590.%E2%80%85%E8%88%B9%E6%97%85/8f68af44.png" data-original-src="https://upload.acmicpc.net/6f0e5635-7743-4b66-8b62-8efbec75ee58/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /> <img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5590.%E2%80%85%E8%88%B9%E6%97%85/47b241fc.png" data-original-src="https://upload.acmicpc.net/eb03fa6c-d688-4ade-a7b5-36fdf2023d84/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">図１. 入力例１と出力例１に対するアニメーションと分解写真</p>