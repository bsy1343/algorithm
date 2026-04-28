# [Gold I] 용량 확보 - 9327

[문제 링크](https://www.acmicpc.net/problem/9327)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 894, 정답: 265, 맞힌 사람: 171, 정답 비율: 26.227%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>NSA는 점점 늘어나는 러시아어와 스페인어 번역 데이터와 전화 도청 파일의 용량 때문에, 데이터 센터의 용량을 최대 1 엑사바이트로 확장하려고 한다.&nbsp;</p>

<p>NSA의 예산은 넉넉한 편이 아니기 때문에, 새 디스크를 구매할 수 없다. 따라서, 불필요한 데이터를 제거해 용량을 확보하려고 한다.</p>

<p>모든 서버는 네 디스크가 RAID-1을 이루고 있다. RAID-5로 방식을 바꿔 용량을 확보해보자.</p>

<p>현재 데이터 센터에는 총 n개의 RAID-1 세트가 있다. 각각의 세트 i는 크기가 S<sub>i</sub>인 디스크로 이루어져 있다. 이 세트는 데이터 S<sub>i</sub> GB를 보관할 수 있다. RAID-5 세트로 변환하면 보관할 수 있는 용량이 총 세 배가 된다. (3 &middot; S<sub>i</sub> GB) 되도록 적은 용량을 RAID-5로 변환해 필요한 용량을 얻는 프로그램을 작성하시오.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9327.%E2%80%85%EC%9A%A9%EB%9F%89%E2%80%85%ED%99%95%EB%B3%B4/44ade036.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/9327.%E2%80%85%EC%9A%A9%EB%9F%89%E2%80%85%ED%99%95%EB%B3%B4/44ade036.png" data-original-src="https://www.acmicpc.net/upload/images/raid.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:111px; line-height:1.6em; width:463px" /></p>

<p>디스크의 용량 S = 4이고, 저장 가능 용량은 4 GB (D0 ... D3)과 3 &middot; 4 = 12 GB (D0 ... D11) 이다.</p>

### 입력

<p>첫째 줄에 테스트 케이스의 개수가 주어진다. 테스트 케이스의 수는 100개를 넘지 않는다.</p>

<p>각 테스트 케이스의 첫째 줄에는 RAID-1 세트의 수 n과 확보해야 하는 용량 e 가 주어진다.&nbsp;(1 &le; n &le; 100 and 0 &le; e &le; 10<sup>9</sup>)</p>

<p>둘째 줄에는 각 세트의 크기&nbsp;S<sub>1</sub>&nbsp;... S<sub>n</sub>&nbsp;(1 &le; S<sub>i</sub>&nbsp;&le; 2 000)가 주어진다.</p>

### 출력

<p>각 테스트 케이스 마다 변환해야 하는 용량(GB)을 출력한다. 용량을 e만큼 더 확보할 수 없는 경우에는 &ldquo;<code>FULL</code>&rdquo;을 출력한다.</p>

### 힌트

<ul>
	<li>첫 번째 예제의 경우에, RAID 세트 하나를 변환하면 된다. 새로운 용량은 1500 + 500 = 2000 GB가 된다.</li>
	<li>두 번째 예제는 600 GB와 700 GB 디스크를 변환하면&nbsp;400 + 600 + 700 + 1000 = 2700 GB, 400 + 1800 + 2100 + 1000 = 5300 GB가 된다. 다른 변환은 모두 비효율적이다.</li>
	<li>세 번째 예제의 경우는 필요한 용량을 확보할 수 없다.</li>
</ul>