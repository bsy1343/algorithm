# [Bronze I] Tokyo2020 - 24175

[문제 링크](https://www.acmicpc.net/problem/24175)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 157, 정답: 131, 맞힌 사람: 99, 정답 비율: 80.488%

### 분류

구현

### 문제 설명

<p>2020 年東京オリンピックの日本選手団は 2021 年 8 月 8 日に全ての競技を終え，獲得したメダルは金 27，銀 14，銅 17 の計 58 個となった．</p>

<p>それはさておき，あなたにはオリンピック競技の結果が与えられるので，「最多金メダルの年」と「最多メダルの年」を求めてほしい．該当する年が複数存在する場合は，その中で最も早いものを求めてほしい．</p>

### 입력

<p>入力は複数のデータセットからなる．各データセットは次の形式で表される．</p>

<pre>
<i>N</i>
<i>Y<sub>1</sub></i> <i>S<sub>1</sub></i> <i>M<sub>1</sub></i>
...
<i>Y<sub>N</sub></i> <i>S<sub>N</sub></i> <i>M<sub>N</sub></i></pre>

<p>各データセットは&nbsp;<i>N+1</i>&nbsp;行からなる．最初の行にはオリンピック競技で獲得したメダルの枚数&nbsp;<i>N</i>&nbsp;(<i>1 &le; N &le; 200</i>) がある．続く&nbsp;<i>N</i>&nbsp;行にはオリンピック競技の結果が 1 行に 1 個ずつ並んでいる．各行には，競技が開催された年&nbsp;<i>Y<sub>i</sub></i>&nbsp;(<i>1896 &le; Y<sub>i</sub>&nbsp;&le; 2021</i>)，競技名を表す英字のみからなる文字列&nbsp;<i>S<sub>i</sub></i>&nbsp;(<i>1 &le; |S<sub>i</sub>| &le; 20</i>)，メダルの色を表す文字列&nbsp;<i>M<sub>i</sub></i>&nbsp;(<i>M<sub>i</sub>&nbsp;&isin; { &quot;Gold&quot;, &quot;Silver&quot;, &quot;Bronze&quot; }</i>) がこの順に並んでいる．<i>M<sub>i</sub>&nbsp;= &quot;Gold&quot;</i>&nbsp;ならば金メダルを，<i>M<sub>i</sub>&nbsp;= &quot;Silver&quot;</i>&nbsp;ならば銀メダルを，<i>M<sub>i</sub>&nbsp;= &quot;Bronze&quot;</i>&nbsp;ならば銅メダルを獲得したことを表す．また，与えられる競技結果には&nbsp;<i>M<sub>j</sub>&nbsp;= &quot;Gold&quot;</i>&nbsp;を満たす&nbsp;<i>j</i>&nbsp;(<i>1 &le; j &le; N</i>) が少なくとも 1 つ以上存在することが保証される．</p>

<p>入力の終わりは 1 つのゼロからなる行で表される．データセットの個数は 50 を超えない．</p>

### 출력

<p>各データセットについて，最も多く金メダルを獲得した年の中で最も早いもの・最も多くメダルを獲得した年の中で最も早いものを，それぞれ半角スペース区切りで出力せよ．</p>