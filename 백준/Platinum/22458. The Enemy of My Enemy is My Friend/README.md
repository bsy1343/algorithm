# [Platinum III] The Enemy of My Enemy is My Friend - 22458

[문제 링크](https://www.acmicpc.net/problem/22458)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 1, 정답: 1, 맞힌 사람: 1, 정답 비율: 100.000%

### 분류

(분류 없음)

### 문제 설명

<p>時は XXXX 年。戦乱の世である。</p>

<p>土地や資源を巡って、隣り合った国同士の衝突がそこかしこで起こり、世の中の先行きは非常に不透明であった。そんな中とある国が、様々な国と軍事同盟を結んでこの乱世を生き延びようと考えた。軍事同盟は次の条件をみたすように行うことが出来る。</p>

<ul>
	<li>自国の隣国とは同盟を結ぶことは出来ない。</li>
	<li>同盟をした国の隣国とは同盟を結ぶことは出来ない。</li>
</ul>

<p>ただし、国ごとにその軍事的な強さは異なっている。軍事的に強くない複数の国と同盟を結ぶより、軍事的に非常に強い一国と同盟を結んだほうが有利であることも有り得る。ここでは、同盟に含まれる国の軍事的強さの和が最大になるような軍事同盟の結び方を考えたい。</p>

### 입력

<p>入力は複数のデータセットからなる．各データセットの形式は次の通りである。</p>

<pre>
<var>N</var>
<var>A<sub>1</sub></var>&nbsp;<var>B<sub>1</sub></var>&nbsp;<var>C<sub>1</sub></var>&nbsp;<var>D<sub>1,1</sub>...</var>&nbsp;<var>D<sub>1,C<sub>1</sub></sub></var>
<var>A<sub>2</sub></var>&nbsp;<var>B<sub>2</sub></var>&nbsp;<var>C<sub>2</sub></var>&nbsp;<var>D<sub>2,1</sub>...</var>&nbsp;<var>D<sub>2,C<sub>2</sub></sub></var>
<var>...</var>
<var>A<sub>N</sub></var>&nbsp;<var>B<sub>N</sub></var>&nbsp;<var>C<sub>N</sub></var>&nbsp;<var>D<sub>N,1</sub>...</var>&nbsp;<var>D<sub>N,C<sub>N</sub></sub></var>
</pre>

<p>各データセットでは、1行目は国の数 N (1 &le; N &le; 40)が与えられ、2〜N+1行目には国の詳細が与えられる。国の詳細では、国名 A<sub>i</sub>、軍事的強さ B<sub>i</sub>&nbsp;、隣接している国の数 C<sub>i</sub>、隣接している国のリスト D<sub>i,1</sub>... D<sub>i,C<sub>i</sub></sub>&nbsp;が与えられる。自国は1つ目の国 A<sub>1</sub>&nbsp;である。</p>

<p>国名 A<sub>i</sub>&nbsp;は全て異なり、それぞれ1文字以上16文字以下の大文字あるいは小文字アルファベットからなる。軍事的強さ B<sub>i</sub>&nbsp;は0以上1000以下の整数で与えられる。隣接している国のリストにある国名 D<sub>i,j</sub>&nbsp;は A<sub>1</sub>&nbsp;から A<sub>N</sub>&nbsp;のうちいずれかと一致する。また、ある国の隣接国リストにその国自身が含まれることはなく、同じ国名が2回以上重複して含まれることもない。さらに、隣接関係が対称でない場合は入力に存在しない。</p>

<p>入力の終了は0のみからなる行で表される。</p>

### 출력

<p>各テストケースについて、自国を含めた軍事的強さの和が最大になるような同盟を考えたとき、その強さを求め、1行で出力せよ。</p>