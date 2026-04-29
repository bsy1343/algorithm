# [Silver III] 체크 박스 - 34545

[문제 링크](https://www.acmicpc.net/problem/34545)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 339, 정답: 125, 맞힌 사람: 118, 정답 비율: 42.294%

### 분류

구현, 많은 조건 분기

### 문제 설명

<p>데이터 테이블은 행과 열로 정보를 구조화해 보여주는 UI 요소이다. 체크 박스 열은 아래 그림과 같이 헤더에 헤더 체크 박스가 있고, 각 데이터 행에 체크 박스가 하나씩 있다. 각 데이터 행의 체크 박스는 체크된 상태 또는 해제된 상태를 가질 수 있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/34545.%E2%80%85%EC%B2%B4%ED%81%AC%E2%80%85%EB%B0%95%EC%8A%A4/1f2f1345.png" data-original-src="https://boja.mercury.kr/assets/problem/34545-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 275px; width: 500px;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/34545.%E2%80%85%EC%B2%B4%ED%81%AC%E2%80%85%EB%B0%95%EC%8A%A4/ee469c31.png" data-original-src="https://boja.mercury.kr/500" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></p>

<p>체크 박스 열에는 다음 세 가지 조작을 수행할 수 있다.</p>

<ul>
<li>토글: 임의의 데이터 행을 선택해 체크 박스의 상태를 바꾼다. 즉, 체크된 상태였으면 해제된 상태로, 해제된 상태였으면 체크된 상태로 바꾼다.</li>
<li>전체 체크: 체크 박스가 해제된 상태인 데이터 행이 하나라도 있는 경우, 헤더 체크 박스를 눌러 모든 데이터 행의 체크 박스를 체크된 상태로 만든다.</li>
<li>전체 해제: 모든 데이터 행의 체크 박스가 체크된 상태인 경우, 헤더 체크 박스를 눌러 모든 데이터 행의 체크 박스를 해제된 상태로 만든다.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/34545.%E2%80%85%EC%B2%B4%ED%81%AC%E2%80%85%EB%B0%95%EC%8A%A4/c21077f8.png" data-original-src="https://boja.mercury.kr/assets/problem/34545-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 100%;"></p>

<p>예를 들어, 첫번째 또는 두번째 그림의 상태에서는 전체 체크 조작으로 세번째 그림의 상태로 만들 수 있고, 세번째 그림의 상태에서는 전체 해제 조작으로 첫번째 그림의 상태로 만들 수 있다.</p>

<p>$N$개의 데이터 행으로 이루어진 데이터 테이블에 체크 박스 열이 있고, 각 데이터 행의 현재 체크 박스 상태가 주어진다. 주어진 조작만을 사용하여 현재 체크 박스 열을 목표하는 체크 박스 열과 같게 만들려고 한다. 이때 최소 조작 횟수를 구해보자.</p>

### 입력

<p>첫째 줄에 데이터 행의 개수 $N$이 주어진다. ($1 \le N \le 100\ 000$)</p>

<p>다음 줄에 $N$개의 정수가 공백으로 구분되어 주어진다. $i$번째 수는 현재 체크 박스 열의 $i$번째 데이터 행의 체크 박스가 체크된 상태인 경우 $1$, 해제된 상태인 경우 $0$이다.</p>

<p>다음 줄에 $N$개의 정수가 공백으로 구분되어 주어진다. $i$번째 수는 목표하는 체크 박스 열의 $i$번째 데이터 행의 체크 박스 상태가 체크된 상태인 경우 $1$, 해제된 상태인 경우 $0$이다.</p>

### 출력

<p>현재 체크 박스 열을 목표하는 체크 박스 열로 만들기 위한 최소 조작 횟수를 출력한다.</p>