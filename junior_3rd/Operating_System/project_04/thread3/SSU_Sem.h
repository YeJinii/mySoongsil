#include <pthread.h>

typedef struct SSU_Sem {
	pthread_cond_t cond;
	pthread_mutex_t mutex;
	volatile unsigned value;
} SSU_Sem;

void SSU_Sem_init(SSU_Sem *, int);
void SSU_Sem_up(SSU_Sem *);
void SSU_Sem_down(SSU_Sem *);
