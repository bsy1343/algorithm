# [Gold III] 드디어 시작한 화석 발굴 이벤트 - 23307

[문제 링크](https://www.acmicpc.net/problem/23307)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB (추가 메모리 없음)

### 통계

제출: 307, 정답: 89, 맞힌 사람: 79, 정답 비율: 36.574%

### 분류

구현, 많은 조건 분기

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23307.%E2%80%85%EB%93%9C%EB%94%94%EC%96%B4%E2%80%85%EC%8B%9C%EC%9E%91%ED%95%9C%E2%80%85%ED%99%94%EC%84%9D%E2%80%85%EB%B0%9C%EA%B5%B4%E2%80%85%EC%9D%B4%EB%B2%A4%ED%8A%B8/97d649e0.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/23307.%E2%80%85%EB%93%9C%EB%94%94%EC%96%B4%E2%80%85%EC%8B%9C%EC%9E%91%ED%95%9C%E2%80%85%ED%99%94%EC%84%9D%E2%80%85%EB%B0%9C%EA%B5%B4%E2%80%85%EC%9D%B4%EB%B2%A4%ED%8A%B8/97d649e0.png" data-original-src="https://upload.acmicpc.net/de35eeb0-8636-4e46-9a08-1a9fbf36a1e7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 608px; height: 350px;" /></p>

<p>국렬이는 연세대학교 신입생 프로그래밍 경진대회를 개최한 기념으로 공학관 근처 $N \times N$ 크기의 운동장에서 화석 발굴&nbsp;이벤트를 진행하려고 했다.&nbsp;그러나 공학관 내의 무수히 많은 실험으로 인해&nbsp;운동장의 일부가 인체에 매우 위험한 물질로&nbsp;오염되었기에 이 이벤트는 취소되었다. 다행히 우수한 연세대학교 신입생들의 도움을 받아서 오염되지 않은 흙을 공학관 근처 언덕으로 옮기는 작업을&nbsp;마무리했다. 덕분에&nbsp;국렬이는 드디어 화석 발굴 이벤트를 진행할 수 있게 되었다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23307.%E2%80%85%EB%93%9C%EB%94%94%EC%96%B4%E2%80%85%EC%8B%9C%EC%9E%91%ED%95%9C%E2%80%85%ED%99%94%EC%84%9D%E2%80%85%EB%B0%9C%EA%B5%B4%E2%80%85%EC%9D%B4%EB%B2%A4%ED%8A%B8/eee0723b.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/23307.%E2%80%85%EB%93%9C%EB%94%94%EC%96%B4%E2%80%85%EC%8B%9C%EC%9E%91%ED%95%9C%E2%80%85%ED%99%94%EC%84%9D%E2%80%85%EB%B0%9C%EA%B5%B4%E2%80%85%EC%9D%B4%EB%B2%A4%ED%8A%B8/eee0723b.png" data-original-src="https://upload.acmicpc.net/5db6fc3f-a2a3-443f-8502-aed69096b8f3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 250px; width: 259px;" /></p>

<p style="text-align: center;">[그림] 화석의 사진</p>

<p>화석은 그림과 같이 정사각형 크기의 달팽이 형태로, 한 변의 길이는 무조건 $4k+1$ 꼴이다.&nbsp;화석의 중심은&nbsp;위에서 $2k+1$칸, 왼쪽에서 $2k+1$칸 떨어진 칸을 의미한다.&nbsp;($k$는 양의 정수)</p>

<p>화석 발굴 이벤트는 공학관 근처 운동장에&nbsp;묻힌 화석을&nbsp;찾는 이벤트이다. 당신은 주어진 흙 속에서 화석들을 전부 찾아내야 한다.</p>

### 입력

<p>첫 번째 줄에 운동장의 한 변의 길이를 의미하는&nbsp;양의 정수&nbsp;$N$이 주어진다. ($5&nbsp;\le N \le 1\,250$)</p>

<p>두 번째 줄부터 $N$개의 줄에 걸쳐서 운동장에 대한 정보가 주어진다. <code><span style="color:#e74c3c;">.</span></code>은 흙만 있는 칸을 의미하고, <code><span style="color:#e74c3c;">#</span></code>은 화석이 있는&nbsp;칸을 의미한다. 입력으로 들어오는 화석의 형태는 언제나 달팽이 형태로만 나온다.</p>

<p>운동장에 최소 $1$개 이상의 화석이 묻혀있으며, 화석들은 붙어있거나 운동장 밖으로 빠져나온 경우는 주어지지 않는다.</p>

### 출력

<p>첫 번째 줄에 화석의 개수를 출력한다.</p>

<p>두 번째 줄부터 각 줄에 화석의 중심의 위치의 행 번호와 열 번호, 화석의 한 변의 길이, 그리고 화석의 방향을 출력한다. 화석의 정보는 화석의 중심 위치의 행 번호가 작은 것부터,&nbsp;행 번호가 같은 경우 열 번호가 작은 것부터&nbsp;출력한다.</p>

### 힌트

<p>달팽이들의 방향은 다음과 같이 표기한다.</p>

<table class="table table-bordered table-center-50 td-center td-middle">
	<tbody>
		<tr>
			<td style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23307.%E2%80%85%EB%93%9C%EB%94%94%EC%96%B4%E2%80%85%EC%8B%9C%EC%9E%91%ED%95%9C%E2%80%85%ED%99%94%EC%84%9D%E2%80%85%EB%B0%9C%EA%B5%B4%E2%80%85%EC%9D%B4%EB%B2%A4%ED%8A%B8/71b56a02.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/23307.%E2%80%85%EB%93%9C%EB%94%94%EC%96%B4%E2%80%85%EC%8B%9C%EC%9E%91%ED%95%9C%E2%80%85%ED%99%94%EC%84%9D%E2%80%85%EB%B0%9C%EA%B5%B4%E2%80%85%EC%9D%B4%EB%B2%A4%ED%8A%B8/71b56a02.png" data-original-src="https://upload.acmicpc.net/efdc2093-8cb3-4d21-b50d-41c1507f0561/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td style="text-align: center;">UL</td>
			<td style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23307.%E2%80%85%EB%93%9C%EB%94%94%EC%96%B4%E2%80%85%EC%8B%9C%EC%9E%91%ED%95%9C%E2%80%85%ED%99%94%EC%84%9D%E2%80%85%EB%B0%9C%EA%B5%B4%E2%80%85%EC%9D%B4%EB%B2%A4%ED%8A%B8/f8ce9f72.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/23307.%E2%80%85%EB%93%9C%EB%94%94%EC%96%B4%E2%80%85%EC%8B%9C%EC%9E%91%ED%95%9C%E2%80%85%ED%99%94%EC%84%9D%E2%80%85%EB%B0%9C%EA%B5%B4%E2%80%85%EC%9D%B4%EB%B2%A4%ED%8A%B8/f8ce9f72.png" data-original-src="https://upload.acmicpc.net/d7d53365-0308-46ba-a92e-d00387516f35/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td style="text-align: center;">UR</td>
		</tr>
		<tr>
			<td style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23307.%E2%80%85%EB%93%9C%EB%94%94%EC%96%B4%E2%80%85%EC%8B%9C%EC%9E%91%ED%95%9C%E2%80%85%ED%99%94%EC%84%9D%E2%80%85%EB%B0%9C%EA%B5%B4%E2%80%85%EC%9D%B4%EB%B2%A4%ED%8A%B8/1f5b452b.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/23307.%E2%80%85%EB%93%9C%EB%94%94%EC%96%B4%E2%80%85%EC%8B%9C%EC%9E%91%ED%95%9C%E2%80%85%ED%99%94%EC%84%9D%E2%80%85%EB%B0%9C%EA%B5%B4%E2%80%85%EC%9D%B4%EB%B2%A4%ED%8A%B8/1f5b452b.png" data-original-src="https://upload.acmicpc.net/90462bb6-6d6a-4830-b0d6-5fe3be2df9ae/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td style="text-align: center;">LU</td>
			<td style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23307.%E2%80%85%EB%93%9C%EB%94%94%EC%96%B4%E2%80%85%EC%8B%9C%EC%9E%91%ED%95%9C%E2%80%85%ED%99%94%EC%84%9D%E2%80%85%EB%B0%9C%EA%B5%B4%E2%80%85%EC%9D%B4%EB%B2%A4%ED%8A%B8/aa45fb56.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/23307.%E2%80%85%EB%93%9C%EB%94%94%EC%96%B4%E2%80%85%EC%8B%9C%EC%9E%91%ED%95%9C%E2%80%85%ED%99%94%EC%84%9D%E2%80%85%EB%B0%9C%EA%B5%B4%E2%80%85%EC%9D%B4%EB%B2%A4%ED%8A%B8/aa45fb56.png" data-original-src="https://upload.acmicpc.net/e6474e35-45b3-4063-b81e-b6cb6844aaa7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td style="text-align: center;">RU</td>
		</tr>
		<tr>
			<td style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23307.%E2%80%85%EB%93%9C%EB%94%94%EC%96%B4%E2%80%85%EC%8B%9C%EC%9E%91%ED%95%9C%E2%80%85%ED%99%94%EC%84%9D%E2%80%85%EB%B0%9C%EA%B5%B4%E2%80%85%EC%9D%B4%EB%B2%A4%ED%8A%B8/9ef82088.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/23307.%E2%80%85%EB%93%9C%EB%94%94%EC%96%B4%E2%80%85%EC%8B%9C%EC%9E%91%ED%95%9C%E2%80%85%ED%99%94%EC%84%9D%E2%80%85%EB%B0%9C%EA%B5%B4%E2%80%85%EC%9D%B4%EB%B2%A4%ED%8A%B8/9ef82088.png" data-original-src="https://upload.acmicpc.net/727c806c-af44-4948-b6aa-2b4281f7a418/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td style="text-align: center;">LD</td>
			<td style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23307.%E2%80%85%EB%93%9C%EB%94%94%EC%96%B4%E2%80%85%EC%8B%9C%EC%9E%91%ED%95%9C%E2%80%85%ED%99%94%EC%84%9D%E2%80%85%EB%B0%9C%EA%B5%B4%E2%80%85%EC%9D%B4%EB%B2%A4%ED%8A%B8/f85014f4.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/23307.%E2%80%85%EB%93%9C%EB%94%94%EC%96%B4%E2%80%85%EC%8B%9C%EC%9E%91%ED%95%9C%E2%80%85%ED%99%94%EC%84%9D%E2%80%85%EB%B0%9C%EA%B5%B4%E2%80%85%EC%9D%B4%EB%B2%A4%ED%8A%B8/f85014f4.png" data-original-src="https://upload.acmicpc.net/6d4a1339-099d-4719-8fbd-9bbcd72733d9/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td style="text-align: center;">RD</td>
		</tr>
		<tr>
			<td style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23307.%E2%80%85%EB%93%9C%EB%94%94%EC%96%B4%E2%80%85%EC%8B%9C%EC%9E%91%ED%95%9C%E2%80%85%ED%99%94%EC%84%9D%E2%80%85%EB%B0%9C%EA%B5%B4%E2%80%85%EC%9D%B4%EB%B2%A4%ED%8A%B8/2f03411d.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/23307.%E2%80%85%EB%93%9C%EB%94%94%EC%96%B4%E2%80%85%EC%8B%9C%EC%9E%91%ED%95%9C%E2%80%85%ED%99%94%EC%84%9D%E2%80%85%EB%B0%9C%EA%B5%B4%E2%80%85%EC%9D%B4%EB%B2%A4%ED%8A%B8/2f03411d.png" data-original-src="https://upload.acmicpc.net/f8a5c611-1723-45d8-8ce4-81c1bb2b6149/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td style="text-align: center;">DL</td>
			<td style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23307.%E2%80%85%EB%93%9C%EB%94%94%EC%96%B4%E2%80%85%EC%8B%9C%EC%9E%91%ED%95%9C%E2%80%85%ED%99%94%EC%84%9D%E2%80%85%EB%B0%9C%EA%B5%B4%E2%80%85%EC%9D%B4%EB%B2%A4%ED%8A%B8/ad186050.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/23307.%E2%80%85%EB%93%9C%EB%94%94%EC%96%B4%E2%80%85%EC%8B%9C%EC%9E%91%ED%95%9C%E2%80%85%ED%99%94%EC%84%9D%E2%80%85%EB%B0%9C%EA%B5%B4%E2%80%85%EC%9D%B4%EB%B2%A4%ED%8A%B8/ad186050.png" data-original-src="https://upload.acmicpc.net/a40a0f4a-5a21-4a8b-950b-98cb647509bd/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td style="text-align: center;">DR</td>
		</tr>
	</tbody>
</table>