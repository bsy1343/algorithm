# [Silver III] 問題 ３ - 5609

[문제 링크](https://www.acmicpc.net/problem/5609)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 58, 정답: 48, 맞힌 사람: 43, 정답 비율: 84.314%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>サイコロが以下の図のような向きで置かれている．</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/96b16a54-ce9e-4112-a40e-e2745a13f86a/-/preview/" /></p>

<p>ここで使用するサイコロは， この図のように， 上側に 1，南側に 2 があるときは，東側に 3 があるものとする． サイコロの向かいあう面の和は必ず 7 なので， 見えない面はそれぞれ北側 5， 西側 4，下側 6 になっている．</p>

<p>この初期配置の状態から指示に従ってサイコロを動かしていく． ただし， 指示は以下の 6 通りの操作を何回か行うものである．</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/5485c2f2-0837-4f13-9464-f63c33b91fdf/-/preview/" /><img alt="" src="https://upload.acmicpc.net/581380c2-d771-4f47-ac8e-9a2407240de4/-/preview/" /><img alt="" src="https://upload.acmicpc.net/4eb5e3a3-4a58-44dc-b37e-67ad656a7c22/-/preview/" /><img alt="" src="https://upload.acmicpc.net/c0eea1c0-3a8d-434f-b599-33d4f09dee07/-/preview/" /><img alt="" src="https://upload.acmicpc.net/1de5d33b-1f5a-4963-a118-3992bc56c7d6/-/preview/" /><img alt="" src="https://upload.acmicpc.net/f9c0d6d1-b790-45e6-bb18-8426b788d852/-/preview/" /></p>

<p>North，East，South，West の各操作は指示された方向へサイコロを 90 度回転させる．Right，Left の 2 つの操作は上下の面はそのままで水平方向に 90 度回転させる． （回転させる向きに要注意．）</p>

<p>初期配置で上の面に出ている目 1 を初期値とし， 1 回の操作が終わるたびに， 上の面に出ている目の数を加算していき， 指示にしたがってすべての操作を終えたときの合計値を出力するプログラムを作成しなさい.</p>

### 입력

<p>入力ファイルの 1 行目には総指示回数 n が書かれていて， 続く n 行の各行には 「North，East，South，West，Right，Left」 のいずれか 1 つの指示が書かれているものとする． ただし， n ≦ 10000 とする．</p>

### 출력

<p>アップロードする出力ファイルにおいては， 出力（合計値）の後に改行を入れること．</p>