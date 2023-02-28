export class Onibus {

  routeCode!: string;
  routeMnemonic!: string;
  companyId!: number;
  stopId!: number;
  serviceId!: number;
  serviceMnemonic!: string;
  predictionType!: string;
  predictionTime!: string;
  activeVehicles!: number;
  scheduledVehicles!: number;
  hasRealTime!: boolean;
  messages!: Messages[];
  vehicles!: Vehicles[];

}

export class Messages {

	text!: string;
	ts!: number;
	companyId!: number;
	companyType!: string;
	companyName!: string;

}

export class Vehicles {

	plate!: string;
	prefix!: string;
	wheelchair!: boolean;
	climatized!: boolean;
	prediction!: number;
	age!: number;
	type!: string;

}
