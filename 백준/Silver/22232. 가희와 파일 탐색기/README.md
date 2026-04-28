# [Silver III] 가희와 파일 탐색기 - 22232

[문제 링크](https://www.acmicpc.net/problem/22232)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 512 MB

### 통계

제출: 1452, 정답: 528, 맞힌 사람: 387, 정답 비율: 35.440%

### 분류

자료 구조, 정렬

### 문제 설명

<p>가희는 <em>jo_test</em> 폴더에 들어와 있습니다.&nbsp;가희는 <em>jo_test</em>에 있는 파일 <em>N</em>개를&nbsp;아래 기준에 따라 정렬하려고 합니다.</p>

<ol>
	<li>파일명 (<em>FILENAME</em>) 사전순으로</li>
	<li>파일명 (<em>FILENAME</em>)이 같다면 가희가 설치한 OS에서 인식하는 확장자가 붙은 것이 먼저 나오게</li>
	<li>1과 2로도 순서를 결정할 수 없다면, 파일 확장자 (<em>EXTENSION</em>) 사전 순으로</li>
</ol>

<p>파일 <em>N</em>개를 문제에서 설명하는 정렬 기준에 따라 정렬해 주세요.&nbsp;사전순의 기준은 아스키 코드 순입니다.</p>

### 입력

<p>첫 번째 줄에 jo_test 폴더에 있는 파일 개수 <em>N</em>과 가희가 설치한 OS에서 인식하는 파일 확장자의 개수 <em>M</em>이 공백으로 구분되어&nbsp;주어집니다.</p>

<p>2번째 줄부터 <em>N+1</em>번째 줄까지 <em>FILENAME</em>.<em>EXTENSION </em>형식의 문자열이 주어집니다. <strong>여기서 .은 온점을 의미합니다.</strong></p>

<p><em>FILENAME</em>은&nbsp;소문자와 숫자로만, <em>EXTENSION</em>은 소문자로만 이루어져 있습니다.</p>

<p>그 다음 줄 부터 <strong>가희가 설치한 OS에서 인식하는</strong> 파일 확장자 (<em>EXTENSION</em>)&nbsp;<em>M</em>개가&nbsp;주어집니다.</p>

### 출력

<p>기준에 따라 정렬된 결과를 출력해 주세요.</p>

### 제한

<ul>
	<li>1 &le; <em>N</em> &le; 2&times;10<sup>5</sup></li>
	<li>1 &le; M &le; 2&times;10<sup>5</sup></li>
	<li>파일 확장자와 파일명의 길이는 <strong>10을 넘지 않습니다.</strong></li>
	<li>입력으로 주어지는 <em>FILENAME</em>.<em>EXTENSION </em>꼴의 <em>N</em>개는 중복되지 않습니다.&nbsp;</li>
	<li>가희가 설치한 OS에서 인식하는 파일 확장자 <em>M</em>개는 중복되지 않습니다.</li>
</ul>