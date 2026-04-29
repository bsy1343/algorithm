# [Platinum II] 기록의 판 - 34141

[문제 링크](https://www.acmicpc.net/problem/34141)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 126, 정답: 45, 맞힌 사람: 42, 정답 비율: 45.652%

### 분류

그리디 알고리즘, 이분 탐색

### 문제 설명

<p>세월이 흐르고, 사람들은 그들이 세운 문명을 기록으로 남기기 시작했다. 석판 위에는 그들의 마을, 의식, 흐름, 그리고 모든 역사를 담은 숫자들이 새겨졌다.</p>

<p>하지만 그들은 기록의 일부가 잘못되었음을 발견했다. 그들은 기록의 일부를 바로잡아 올바른 흐름을 되찾고자 했다.</p>

<p>그들이 남긴 기록을 살펴보고, 사라진 기록을 되찾아라.</p>

<hr>
<p>기록은 $N\times N$ 크기의 격자 형태로 정리되어 있으며, 위에서부터 $r$번째 행, 왼쪽에서부터 $c$번째 열의 칸을 $(r,c)$로 표기한다. 각 행에는 $N$자리 수가 왼쪽에서 오른쪽으로 순서대로 새겨져 있고, 각 칸에는 하나의 자릿수가 적혀 있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34141.%E2%80%85%EA%B8%B0%EB%A1%9D%EC%9D%98%E2%80%85%ED%8C%90/e1fa6297.png" data-original-src="https://boja.mercury.kr/assets/problem/34141-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 293px; height: 300px;"></p>

<p>사람들이 기록한 수들은 아래로 갈수록 증가해야 했다. 그러나 일부 기록이 잘못되어 몇몇 줄이 이 규칙을 만족하지 않게 되었다. 사람들은 판에서 일부 숫자들을 지워, 각 행에서 남은 숫자들을 왼쪽에서 오른쪽으로 읽은 값이 위에서 아래로 내려갈수록 증가하도록 만들고자 했다. <strong>이때, 한 행 위의 모든 숫자를 제거할 수는 없다.</strong></p>

<p>예를 들어, 아래와 같은 상황을 보자.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34141.%E2%80%85%EA%B8%B0%EB%A1%9D%EC%9D%98%E2%80%85%ED%8C%90/bb761121.png" data-original-src="https://boja.mercury.kr/assets/problem/34141-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 773px; height: 300px;"></p>

<p>왼쪽의 판에서 오른쪽처럼 총 6개의 숫자를 지우면, 각 행을 따라 읽은 수들은 $[335,854,2198,7356,26481]$과 같이 증가하게 된다.</p>

<p>각 행을 따라 읽은 수들이 증가하도록 만들기 위해 지워야 하는 숫자의 최소 개수를 구해 보자.</p>

### 입력

<p>첫 줄에는 판의 크기를 나타내는 정수 $N$이 주어진다.</p>

<p>이후 $N$개의 줄에 걸쳐, 각 행에 적힌 $N$개의 숫자 $B_{i1},B_{i2},\cdots ,B_{iN}$가 공백 없이 주어진다. 이때 $B_{ij}$는 칸 $(i,j)$에 새겨진 숫자이다.</p>

### 출력

<p>지워야 하는 숫자의 최소 개수를 출력한다. 항상 조건을 만족하도록 숫자를 지우는 방법이 존재함이 보장된다.</p>

### 제한

<ul>
	<li>$2\le N\le 2000$</li>
	<li>$1\le B_{ij}\le 9$ $(1\le i,j\le N)$</li>
</ul>