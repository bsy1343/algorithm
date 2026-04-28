# [Bronze IV] 감마선을 맞은 컴퓨터 - 30402

[문제 링크](https://www.acmicpc.net/problem/30402)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 3442, 정답: 2230, 맞힌 사람: 2104, 정답 비율: 66.393%

### 분류

구현, 문자열

### 문제 설명

<p>춘배와 나비, 영철은 어느 날 지구에 나타난 UFO에게 감마선을 맞을 뻔했다. 다행히도 감마선은 행복하게 뒹굴고 있던 고양이들 옆에 있던 컴퓨터에 맞았지만, 이로 인해 컴퓨터에 저장된 춘배와 나비, 영철의 소중한 사진들의 픽셀이 모두 섞이는 사태가 발생했다! 더 이상 형체를 알아볼 수 없게 된 사진들을 보며 슬퍼하던 고양이들은 사진 복구로 유명한 전문가에게 사진의 복구를 맡기기로 했다. 자신의 사진을 다른 고양이가 보는 게 싫었던 춘배는 사진 복구를 맡기기 전에 당신에게 사진을 분류해 주는 프로그램을 만들어 달라고 부탁하였다.</p>

<p>프로그램은 주어진 사진이 어떤 고양이의 사진인지 구분해야 한다. 하얀색(w)이 존재한다면 춘배, 검은색(b)이 존재한다면 나비, 회색(g)이 존재한다면 영철의 사진이다. 사진은 고양이(<span style="color:#e74c3c;"><code>w</code></span>, <span style="color:#e74c3c;"><code>b</code></span>, <span style="color:#e74c3c;"><code>g</code></span>) 또는 배경(<span style="color:#e74c3c;"><code>r</code></span>, <span style="color:#e74c3c;"><code>o</code></span>, <span style="color:#e74c3c;"><code>y</code></span>, <span style="color:#e74c3c;"><code>p</code></span>)으로 이루어져 있으며 한 사진에 고양이는 무조건 1마리만 나온다.</p>

<table align="center" border="1" cellpadding="1" cellspacing="1" class="table table-bordered" style="width: 500px;">
	<tbody>
		<tr>
			<td style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/30402.%E2%80%85%EA%B0%90%EB%A7%88%EC%84%A0%EC%9D%84%E2%80%85%EB%A7%9E%EC%9D%80%E2%80%85%EC%BB%B4%ED%93%A8%ED%84%B0/1bb323bb.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/30402.%E2%80%85%EA%B0%90%EB%A7%88%EC%84%A0%EC%9D%84%E2%80%85%EB%A7%9E%EC%9D%80%E2%80%85%EC%BB%B4%ED%93%A8%ED%84%B0/1bb323bb.png" data-original-src="https://upload.acmicpc.net/418e79b5-1210-4ed5-aa61-e6a9338a743c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/30402.%E2%80%85%EA%B0%90%EB%A7%88%EC%84%A0%EC%9D%84%E2%80%85%EB%A7%9E%EC%9D%80%E2%80%85%EC%BB%B4%ED%93%A8%ED%84%B0/9ca2a9aa.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/30402.%E2%80%85%EA%B0%90%EB%A7%88%EC%84%A0%EC%9D%84%E2%80%85%EB%A7%9E%EC%9D%80%E2%80%85%EC%BB%B4%ED%93%A8%ED%84%B0/9ca2a9aa.png" data-original-src="https://upload.acmicpc.net/91793c3d-9170-40ad-8b3d-8b95de54a4b4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/30402.%E2%80%85%EA%B0%90%EB%A7%88%EC%84%A0%EC%9D%84%E2%80%85%EB%A7%9E%EC%9D%80%E2%80%85%EC%BB%B4%ED%93%A8%ED%84%B0/c1867c60.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/30402.%E2%80%85%EA%B0%90%EB%A7%88%EC%84%A0%EC%9D%84%E2%80%85%EB%A7%9E%EC%9D%80%E2%80%85%EC%BB%B4%ED%93%A8%ED%84%B0/c1867c60.png" data-original-src="https://upload.acmicpc.net/3d6bc652-62e8-4b9b-8c2a-e42344f52f8d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
		</tr>
		<tr>
			<td style="text-align: center;">춘배(w)</td>
			<td style="text-align: center;">나비(b)</td>
			<td style="text-align: center;">영철(g)</td>
		</tr>
	</tbody>
</table>

<p>입력으로 주어진 사진이 어떤 고양이의 사진인지 구분해 주자.</p>

### 입력

<p>15줄에 걸쳐 한 줄에 15개씩 섞여버린 사진의 픽셀 색이 공백으로 구분되어 주어진다.</p>

### 출력

<p>춘배의 사진이라면 <span style="color:#e74c3c;"><code>chunbae</code></span>, 나비의 사진이라면 <span style="color:#e74c3c;"><code>nabi</code></span>, 영철의 사진이라면 <span style="color:#e74c3c;"><code>yeongcheol</code></span>을 출력한다.</p>