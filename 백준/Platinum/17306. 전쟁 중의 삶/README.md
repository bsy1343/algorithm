# [Platinum III] 전쟁 중의 삶 - 17306

[문제 링크](https://www.acmicpc.net/problem/17306)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 721, 정답: 192, 맞힌 사람: 145, 정답 비율: 25.893%

### 분류

자료 구조, 트리, 집합과 맵, 최소 공통 조상, 트라이

### 문제 설명

<p>석환나라에 전쟁이 일어났다! 석환나라는 엄청나게 큰 이진 트리 모양의 국가로,&nbsp;1,2, ... ,10<sup>100</sup> 까지 번호가 붙여진 총&nbsp;10<sup>100</sup>&nbsp;개의 도시로 이루어져 있다. 석환나라에는&nbsp;10<sup>100</sup>-1개의 도로가 있는데, 이 중 <em>i</em>번째 도로는 (1 &le; <em>i</em> &lt;10<sup>100</sup>)&nbsp;$\lfloor \frac{i+1}{2} \rfloor$ 번 도시와 <em>i</em>+1 번 도시를 잇는데, 이를 그림으로 묘사하면 아래와 같다:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17306.%E2%80%85%EC%A0%84%EC%9F%81%E2%80%85%EC%A4%91%EC%9D%98%E2%80%85%EC%82%B6/137afe88.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/17306.%E2%80%85%EC%A0%84%EC%9F%81%E2%80%85%EC%A4%91%EC%9D%98%E2%80%85%EC%82%B6/137afe88.png" data-original-src="https://upload.acmicpc.net/7d145311-fa1b-474e-9fdf-c2535cab046e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>총리 <em>윈스턴 아기서콴</em>(<em>Winston Agiseokhwan</em>)은 위기의 석환나라를 구하는 중대한 임무를 맡고 있다. 석환나라의 적국들은 석환나라의 중요 군 시설을 방해하는 데 혈안이 되어 있기 때문에, 석환나라의 국민들을 보호하기 위해서는 군대가 자주 오가는 도시를 우선 방어하는 것이 효과적이다. 석환나라에는&nbsp;<em>N</em>개의 군부대가 서로 다른 도시에 존재하고, 군부대들은 서로 물자나 정보를 주고받기 위해서 오간다.</p>

<p>이때, 어떠한 도시가&nbsp;<strong>위험하다</strong>는 것은, 해당 도시에 군부대가 있거나, 경로가 해당 도시를 지나는 서로 다른 두 군부대가 존재함을 뜻한다. 석환나라는 트리이고, 경로는 같은 도시를 두 번 방문하지 않아야 한다고 정의되기 때문에, 두 군부대를 지나는 경로는 언제나 유일하다는 사실을 유념하자.</p>

<p>아기서콴 총리를 위해, 석환나라에 있는 위험한 도시의 개수를 계산해주자.</p>

### 입력

<p>첫 번째 줄에 군부대의 수 <em>N</em>이 주어진다. (2 &le;<em> </em><em>N</em> &le; 250,000)</p>

<p>이후 <em>N</em>개의 줄에 군부대가 있는 도시의 번호를 나타내는 수열 <em>A<sub>1</sub></em>, ..., <em>A<sub>N</sub></em>이 주어진다. 주어지는 도시들은 서로 다르다. (1 &le; <em>A<sub>i</sub></em>&nbsp;&lt; 2<sup>50</sup>)</p>

### 출력

<p>석환나라에 있는 위험한 도시의 개수를 출력하라.</p>