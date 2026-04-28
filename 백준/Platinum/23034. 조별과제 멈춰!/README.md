# [Platinum V] 조별과제 멈춰! - 23034

[문제 링크](https://www.acmicpc.net/problem/23034)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 1630, 정답: 514, 맞힌 사람: 386, 정답 비율: 31.104%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 최소 스패닝 트리

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/23034.%E2%80%85%EC%A1%B0%EB%B3%84%EA%B3%BC%EC%A0%9C%E2%80%85%EB%A9%88%EC%B6%B0!/6e52c395.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/23034.%E2%80%85%EC%A1%B0%EB%B3%84%EA%B3%BC%EC%A0%9C%E2%80%85%EB%A9%88%EC%B6%B0!/6e52c395.png" data-original-src="https://upload.acmicpc.net/2949c980-da11-4575-8cd9-39b0372e783e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 500px; width: 500px;" /></p>

<p>교수님이 시험 기간에 조별 과제를 준비하셨다...! 가톨릭대학교의 조교 아리는 <em>N</em>명의 학생을 2개의 조로 구성하여 과제 공지를 하려 한다. 이때, 구성된 각 조의 인원은 1명 이상이어야 한다. 각 학생은 1~<em>N</em>의 정수 중 고유한 번호를 학번으로 갖는다.</p>

<p>모든 것이 귀찮은 아리는&nbsp;각 조의 팀장에게만 공지를 전달한다.&nbsp;아리는 <em>N</em>명의 학생 사이에 있는&nbsp;총 <em>M</em>개의 회선의 리스트를 가지고 있다.&nbsp;리스트에는 각 회선에 연결된&nbsp;두 학생의 학번 <em>A</em>와&nbsp;<em>B</em>, 연락에 필요한 비용&nbsp;<em>C</em>가 적혀있다. 회선이 연결된 두 학생은 서로 연락이 가능하다.&nbsp;아리가 각 팀장에게 공지를 전달하면, 각 팀장과 공지를 알게 된 팀원은 같은 조의 모든 팀원에게 공지 내용을 회선을 통해서만 전달한다. 어떤 학생이 팀장이 되어도 모든 학생은 공지 내용을 전달받을 수 있다.</p>

<p>아리는 공지 채팅방을 만들 생각은 안 하고, 모든 학생이 공지 내용을&nbsp;알게 될 때까지&nbsp;학생들이 연락하며 소요되는 비용의 총합 <em>T</em>의 최솟값을&nbsp;알고 싶어졌다. 그것을 구하여 팀장을 정한 뒤 조를 구성하려고 한다.</p>

<p>아리는 다음과 같은<em> Q</em>개의 질문을 한다.</p>

<ul>
	<li>X Y : <em>X</em>와 <em>Y</em>가 팀장일 때, <em>T</em>의 최솟값은 무엇인가?</li>
</ul>

<p><em>Q</em>개의 질문에 답할 수 있는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 두 정수 <em>N</em>(2 &le; <em>N</em> &le; 1,000), <em>M</em>(<em>N</em>&nbsp;&le; <em>M</em> &le; 100,000)가 주어진다.</p>

<p>다음 줄부터 <em>M</em>개의 줄에 세 정수 <em>A</em>(1 &le; <em>A</em> &le; <em>N</em>), <em>B</em>(1 &le; <em>B</em> &le; <em>N</em>), <em>C</em>(1 &le; <em>C</em> &le; 100,000)가 주어진다. <em>A</em>와 <em>B</em>가 같은 경우는 주어지지 않으며, 두 학생에 대한 회선은&nbsp;여러 개가 주어지지 않는다.</p>

<p>다음 줄에 <em>Q</em>(1 &le; <em>Q</em> &le; 10,000)가 주어진다.</p>

<p>다음 줄부터 <em>Q</em>개의 줄에 두 정수 <em>X</em>(1 &le; <em>X</em> &le; <em>N</em>), <em>Y(</em>1 &le; <em>Y</em> &le; <em>N</em>)가 주어진다. <em>X</em>와 <em>Y</em>가 같은 경우는 주어지지 않는다.</p>

### 출력

<p><em>Q</em>개의 질문에 대한 <em>T</em>의&nbsp;최솟값을 출력한다.</p>