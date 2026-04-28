# [Gold I] Álbum de Figurinhas - 20276

[문제 링크](https://www.acmicpc.net/problem/20276)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 16, 정답: 13, 맞힌 사람: 9, 정답 비율: 81.818%

### 분류

다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>O álbum de figurinhas da Subregional Nlogoniana do ICPC 2020 já está disponível na Nlogônia! Programadores competitivos de todo o país estão comprando álbuns e colecionando figurinhas para celebrar a competição.</p>

<p>Este álbum é especial porque todas as figurinhas são iguais: elas contêm uma foto do troféu deste ano. Para completar o álbum, basta coletar figurinhas suficientes para preencher todos os espaços nele.</p>

<p>Você pode se perguntar: qual a graça de colecionar essas figurinhas? Para deixar as coisas interessantes, as figurinhas são vendidas em pacotes, cada um com um número aleatório de figurinhas. Os fãs celebram quando encontram muitas figurinhas em um pacote, zoam aqueles azarados que encontram poucas figurinhas, e se vangloriam por preencher seus álbuns com poucos pacotes.</p>

<p>Você acabou de adquirir o seu álbum e está pronto para começar a preenchê-lo! Mas antes de comprar os pacotes de figurinhas, você se perguntou: em média, quantos pacotes são necessários para completar um álbum?</p>

### 입력

<p>Há apenas uma linha de entrada contendo três inteiros, N, A e B, separados por um espaço, satisfazendo 1 &le; N &le; 10<sup>6</sup>, 0 &le; A &le; B &le; 10<sup>6</sup> e B &gt; 0, onde:</p>

<ul>
	<li>N é o número de figurinhas necessárias para preencher o álbum;</li>
	<li>A é o número mínimo de figurinhas em um pacote;</li>
	<li>B é o número máximo de figurinhas em um pacote.</li>
</ul>

<p>O número de figurinhas em cada pacote é um inteiro uniformemente distribuído no intervalo fechado [A, B].</p>

### 출력

<p>A saída consiste de apenas uma linha, que deve conter o número esperado de pacotes necessários para completar um álbum. O número será considerado correto se estiver dentro de um erro absoluto ou relativo de 10<sup>&minus;5</sup> da resposta correta.</p>