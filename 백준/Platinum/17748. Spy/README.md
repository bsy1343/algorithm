# [Platinum III] Spy - 17748

[문제 링크](https://www.acmicpc.net/problem/17748)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 56, 정답: 36, 맞힌 사람: 34, 정답 비율: 89.474%

### 분류

깊이 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>あなたは Just Odd Inventions 社を知っているだろうか？ この会社の業務は「ただ奇妙な発明 (just odd inventions)」をすることである．ここでは略して JOI 社と呼ぶ．</p>

<p>ところで，あなたは Incredibly Odd Inventions 社を知っているだろうか？ この会社の業務は「途方もな く奇妙な発明 (incredibly odd inventions)」をすることである．ここでは略して IOI 社と呼ぶ．</p>

<p>JOI 社と IOI 社にはそれぞれ N 人の社員がいる．JOI 社の社員は j1, j2, &middot; &middot; &middot; , jN と名付けられており，IOI 社の社員は i1, i2, &middot; &middot; &middot; , iN と名付けられている．また，JOI 社の社員の内の一人は JOI 社の社長であり，IOI 社 の社員の内の一人は IOI 社の社長である．社長を除く社員のそれぞれに対して，その社員を直接の部下と する同じ会社の社員がちょうど一人存在する．</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17748.%E2%80%85Spy/703ea3ff.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/17748.%E2%80%85Spy/703ea3ff.png" data-original-src="https://upload.acmicpc.net/d5f2ed27-41db-485e-90b2-e476cbd3c046/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 275px; height: 124px;" /></p>

<p style="text-align: center;">図 1: JOI 社と IOI 社の組織の例．社員を表す円から出る矢印はその社員の直接の部下を指している</p>

<p>IOI 社はいつも，JOI 社の研究プロジェクトの情報を盗むことで「途方もなく奇妙な発明」をしている．い ま，JOI 社では，r<sub>1</sub>, r<sub>2</sub>, &middot; &middot; &middot; ,r<sub>M</sub> と名付けられた M 個の研究プロジェクトが発足し，IOI 社では，s<sub>1</sub>, s<sub>2</sub>, &middot; &middot; &middot; , s<sub>M</sub> と名付けられた M 個のスパイプロジェクトが発足した．IOI 社のスパイプロジェクト s<sub>b</sub> は JOI 社の研究プ ロジェクト r<sub>b</sub> の情報を盗むプロジェクトである．</p>

<p>プロジェクトに所属する社員の決め方は JOI 社と IOI 社で同じである．1 つのプロジェクトにつき 1 人の リーダーが決められ，リーダーはその直接の部下全員に命令を下す．命令を受け取った社員はまたその直 接の部下全員に同じ命令を下す．命令を受け取った社員全てとリーダーがそのプロジェクトに所属し，そ の他の社員は所属しない</p>

<table class="table table-bordered" style="width: 100%;">
	<tbody>
		<tr>
			<td style="width: 50%; text-align: center;">
			<table class="table table-bordered" style="width: 100%;">
				<thead>
					<tr>
						<th style="text-align: center;">プロジェクト</th>
						<th style="text-align: center;">リーダー</th>
						<th style="text-align: center;">所属する社</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td style="text-align: center;">研究プロジェクト r<sub>1</sub></td>
						<td style="text-align: center;">j<sub>1</sub></td>
						<td style="text-align: center;">j<sub>1</sub>, j<sub>2</sub>, j<sub>3</sub></td>
					</tr>
					<tr>
						<td style="text-align: center;">研究プロジェクト r<sub>2</sub></td>
						<td style="text-align: center;">j<sub>2</sub></td>
						<td style="text-align: center;">j<sub>2</sub>, j<sub>3</sub></td>
					</tr>
					<tr>
						<td style="text-align: center;">研究プロジェクト r<sub>3</sub></td>
						<td style="text-align: center;">j<sub>2</sub></td>
						<td style="text-align: center;">j<sub>2</sub>, j<sub>3</sub></td>
					</tr>
					<tr>
						<td style="text-align: center;">研究プロジェクト r<sub>4</sub></td>
						<td style="text-align: center;">j<sub>3</sub></td>
						<td style="text-align: center;">j<sub>3</sub></td>
					</tr>
				</tbody>
			</table>
			</td>
			<td style="width: 50%; text-align: center;">
			<table class="table table-bordered" style="width: 100%;">
				<thead>
					<tr>
						<th style="text-align: center;">プロジェクト</th>
						<th style="text-align: center;">リーダー</th>
						<th style="text-align: center;">所属する社</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td style="text-align: center;">スパイプロジェクト s<sub>1</sub></td>
						<td style="text-align: center;">i<sub>1</sub></td>
						<td style="text-align: center;">i<sub>1</sub></td>
					</tr>
					<tr>
						<td style="text-align: center;">スパイプロジェクト s<sub>2</sub></td>
						<td style="text-align: center;">i<sub>1</sub></td>
						<td style="text-align: center;">i<sub>1</sub></td>
					</tr>
					<tr>
						<td style="text-align: center;">スパイプロジェクト s<sub>3</sub></td>
						<td style="text-align: center;">i<sub>3</sub></td>
						<td style="text-align: center;">i<sub>3</sub></td>
					</tr>
					<tr>
						<td style="text-align: center;">スパイプロジェクト s<sub>4</sub></td>
						<td style="text-align: center;">i<sub>2</sub></td>
						<td style="text-align: center;">i<sub>1</sub>, i<sub>2</sub>, i<sub>3</sub></td>
					</tr>
				</tbody>
			</table>
			</td>
		</tr>
	</tbody>
	<tfoot>
		<tr>
			<td colspan="2" style="text-align: center;">図 2: 図 1 の JOI 社と IOI 社におけるプロジェクトの</td>
		</tr>
	</tfoot>
</table>

<p>IOI 社の社員 i<sub>a</sub> は JOI 社の社員 j<sub>a</sub> から情報を盗む．スパイプロジェクト s<sub>b</sub> に所属している IOI 社の社 員 i<sub>a</sub> は， JOI 社の社員 ja が研究プロジェクト r<sub>b</sub> に所属しているならばスパイ活動に成功する．それぞれ の会社のすべての社員は複数のプロジェクトに所属している可能性があり，IOI 社の社員は複数のスパイ プロジェクトにおいてスパイ活動に成功する可能性がある．</p>

<p>JOI 社と IOI 社における社員の情報とプロジェクトの情報が与えられたとき，IOI 社の社員のそれぞれに ついて，いくつのスパイプロジェクトにおいてスパイ活動に成功するかを求めるプログラムを作成せよ．</p>

### 입력

<p>標準入力から以下の入力を読み込め．</p>

<ul>
	<li>1 行目には整数 N, M が空白を区切りとして書かれており， JOI 社と IOI 社の社員がそれぞれ N 人で あることと，研究プロジェクトとスパイプロジェクトがそれぞれ M 個であることを表す．</li>
	<li>続く N 行のうち，a 行目 (1 &le; a &le; N) には 2 つの整数 P<sub>a</sub>, Q<sub>a</sub> (0 &le; P<sub>a</sub> &le; N かつ 0 &le; Q<sub>a</sub> &le; N) が書かれて おり，JOI 社の社員 j<sub>a</sub> が社員 j<sub>P<sub>a</sub></sub> の直接の部下であり，IOI 社の社員 i<sub>a</sub> が社員 i<sub>Q<sub>a</sub></sub> の直接の部下であ ることを表す．また，P<sub>a</sub> = 0 のときは社員 j<sub>a</sub> は JOI 社の社長であり，Q<sub>a</sub> = 0 のときは社員 i<sub>a</sub> は IOI 社の社長である．</li>
	<li>続く M 行のうち，b 行目 (1 &le; b &le; M) には 2 つの整数 R<sub>b</sub>, S<sub>b</sub> (1 &le; R<sub>b</sub> &le; N かつ 1 &le; S<sub>b</sub> &le; N) が書かれ ており，研究プロジェクト r<sub>b</sub> のリーダーが社員 j<sub>R<sub>b</sub></sub> で，スパイプロジェクト s<sub>b</sub> のリーダーが社員 i<sub>S<sub>b</sub></sub> であることを表す．</li>
</ul>

### 출력

<p>標準出力に N 行出力せよ．a 行目 (1 &le; a &le; N) には， IOI 社の社員 i<sub>a</sub> がいくつのスパイプロジェクトに おいてスパイ活動に成功するかを表す 1 つの整数を出力せよ．</p>

### 제한

<ul>
	<li>1 &le; N &le; 2 000．</li>
	<li>1 &le; M &le; 500 000．</li>
</ul>